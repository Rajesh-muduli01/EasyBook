package com.myproject.EasyBook.controller;

import com.myproject.EasyBook.config.CloudinaryConfig;
import com.myproject.EasyBook.service.FileUpload;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.text.AttributedString;

@Controller
@RequiredArgsConstructor
public class FileUploadController {

    @Autowired
    private CloudinaryConfig cloudinaryConfig;

    private final FileUpload fileUpload;
    private AttributedString model;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        MultipartFile multipartFile = null;
        String imageURL = fileUpload.uploadFile(multipartFile);
        model.addAttribute("imageURL",imageURL);
        return "gallery";
    }
}
