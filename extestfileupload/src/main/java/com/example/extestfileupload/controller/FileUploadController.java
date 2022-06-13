package com.example.extestfileupload.controller;
/*  DESCRIPTION: learning to create a controller and methods for
*   uploading a file in your project*/

import com.example.extestfileupload.service.StorageProperties;
import com.example.extestfileupload.service.StorageService;
import com.example.extestfileupload.storageExceptions.StorageNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.stream.Collectors;

@Controller
public class FileUploadController {
    // take in storage service
    private final StorageService storageService;

    @Autowired
    public FileUploadController(StorageService storageService){
        this.storageService = storageService;
    }

    //
    @GetMapping(path="/")
    public String listUploadedFiles(Model model){
        model.addAttribute("files", storageService.loadAll().map(
                path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class,
                        "serveFile", path.getFileName().toString().build().toUri.toString()
                                .collect(Collectors.toList()))));
        //
        return "html form";
    }

    //
    @GetMapping(path="/files/{filename:.+")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String filename){
        //
        Resource file = storageService.loadAsResource(filename);
        // setup our header files
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }

    @PostMapping("/")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes){
        storageService.store(file);
        redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");
        return "redirect:/";
    }

    @ExceptionHandler(StorageNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageNotFoundException exc){
        return ResponseEntity.notFound().build();
    }
}
