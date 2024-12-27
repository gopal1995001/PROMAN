package com.productmanagement.proman.CloudnaryConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class CloudinaryConfig {
    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "dkpclgker",
            "api_key", "156682333649397",
            "api_secret", "XMLVVF2QsZLsFOOlbz_Fo5KNDZI"
        ));
    }
}
