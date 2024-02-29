package com.inaing.app.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.inaing.app.entity.Images;
import com.inaing.app.entity.Product;

public interface ImageService {
    public Images save(MultipartFile file, Product product) throws IOException;
}
