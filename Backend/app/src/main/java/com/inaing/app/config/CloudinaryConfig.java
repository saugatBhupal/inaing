package com.inaing.app.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;

@Configuration
public class CloudinaryConfig {
    @Bean
    public Cloudinary getCloudinary(){
        Map config = new HashMap();
        config.put("cloud_name", "ducc6ewes");
        config.put("api_key","473824853329118");
        config.put("api_secret", "dCq2DYz8SEC-3i5I7FuUz51EvmY");
        config.put("secure", true);
        return new Cloudinary(config);
    }
}
