package com.inaing.app.service.serviceImpl;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.inaing.app.service.CloudinaryService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CloudinaryServiceImpl implements CloudinaryService{
    private final Cloudinary cloudinary;
    
    @Override
    public Map upload(MultipartFile file) throws IOException {
        return(cloudinary.uploader().upload(file.getBytes(), Map.of()));
    }
    
}
