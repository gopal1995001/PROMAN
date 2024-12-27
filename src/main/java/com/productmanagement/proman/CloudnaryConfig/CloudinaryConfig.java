package com.productmanagement.proman.CloudnaryConfig;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;

@Configuration
public class CloudinaryConfig {
    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(new HashMap<String, Object>() {{
            put("cloud_name", "dkpclgker");
            put("api_key", "156682333649397");
            put("api_secret", "XMLVVF2QsZLsFOOlbz_Fo5KNDZI");
        }});
    }
}

