package com.inaing.app.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryService {
    public Map upload(MultipartFile file) throws IOException;
}
