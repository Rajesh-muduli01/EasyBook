package com.myproject.EasyBook;

import com.myproject.EasyBook.dto.Response;
import com.myproject.EasyBook.entity.Booking;
import com.myproject.EasyBook.service.CustomUserDetailsService;
import com.myproject.EasyBook.service.interfac.IBookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class EasyBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyBookApplication.class, args);
	}


	@Bean
	public CustomUserDetailsService customUserDetailsService(){
		return new CustomUserDetailsService();
	}
}
