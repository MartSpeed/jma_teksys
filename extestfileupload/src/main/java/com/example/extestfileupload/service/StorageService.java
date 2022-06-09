package com.example.extestfileupload.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    // is this always crud methodology calls inside the interface???
    // is that the information I was missing to make this click???

    // INITIALIZE
    public void init();

    // STORING
    public void store(MultipartFile);

    // LOAD THE PATH THAT FINDS THE FILENAME???
    Stream<Path> loadAll();

    // LOAD/FIND THE FILENAME???
    Path load(String filename);

    //
    Resource loadAsResource(String filename);

    // DELETE ALL
    public void deleteAll();
}
