package com.myproject.EasyBook.service;


import com.myproject.EasyBook.config.CloudinaryConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface FileUpload {



    String uploadFile(MultipartFile multipartFile) throws IOException;
}
