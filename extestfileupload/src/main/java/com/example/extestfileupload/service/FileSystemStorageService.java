package com.example.extestfileupload.service;

import com.example.extestfileupload.storageExceptions.StorageException;
import com.example.extestfileupload.storageExceptions.StorageNotFoundException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class FileSystemStorageService {

    // encapsulated constant
    private final Path rootLocation;

    // create storage properties
    public FileSystemStorageService(){
        // specify the root location
        // add path location
        this.rootLocation = Path.get();

    }

    // store files
    public void store(MultipartFile file){
        //
        try{
            // check if file is empty
            if(file.isEmpty()){
                // create this custom exception
                throw new StorageException("Failed to store file, file does not exist...");
            }
            // where we want to send or add the file
            // store it in the right location
            Path destinationFile = this.rootLocation.resolve(Paths.get(file.getOriginalFilename())).normalize().toAbsolutePath();

            // check to see if you can store the file in this location
            if(!destinationFile.getParent().equals(this.rootLocation.toAbsolutePath())){
                throw new StorageException("Cannot store file at this location");
                // when storing the data, if it is not the correct path, throw an Exception
                // return something that says: cannot store file in this location
                // if it is not opening to the correct path, throw the Exception
                try(InputStream inputStream = file.getInputStream()){
                    // inputStream
                    // even if its empty, we will add the file
                    Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }catch (IOException e){
            // throw new Failed to store
            throw new StorageException("Failed to store file in location ", e);


        }
    }

    // load files
    public Stream<Path> loadAll(){
        // load all the files we want and display them
        try{
            // see 1 and load from there
            return Files.walk(this.rootLocation, 1)
                    .filter(path -> !path.equals(this.rootLocation))
                    .map(this.rootLocation::relativize);
        }catch(IOException e){
            // throw Failed to read storage files
            throw new StorageException("Failed to store file in location ",e);

        }
    }

    // load by file name
    public Path load(String filename){
        // return rootLocation
        return rootLocation.resolve(filename);
    }

    //
    public Resource loadAsResource(String filename){
        // try to load this resource
        try{
            Path file= load(filename);
            Resource resource =  new UrlResource(file.toUri());

            //
            if(resource.exists() || resource.isReadable()){
                return resource;
            }else{
                // if the resource is not there, add message
                throw new StorageNotFoundException("Could not read file " + filename);
            }
        }catch(MalformedURLException e){
            throw new StorageNotFoundException("Could not read file " + filename, e);
        }
    }

    // DELETE ALL
    public void deleteAll(){
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }
}
