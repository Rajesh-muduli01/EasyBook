package com.myproject.EasyBook.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;
@Configuration
public class CloudinaryConfig {

    private final String CLOUD_NAME = "drka42o9a";
    private final String API_KEY = "821363941985923";
    private final String API_SECRET = "gDp9dsSvdKKTHCGt6SX3vksnTtk";
    @Bean
    public Cloudinary cloudinary(MultipartFile photo){
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name",CLOUD_NAME);
        config.put("api_key",API_KEY);
        config.put("api_secret",API_SECRET);

        return new Cloudinary(config);
    }


}
