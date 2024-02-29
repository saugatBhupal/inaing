package com.inaing.app.service.serviceImpl;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.inaing.app.entity.Images;
import com.inaing.app.entity.Product;
import com.inaing.app.repository.ImagesRepository;
import com.inaing.app.service.CloudinaryService;
import com.inaing.app.service.ImageService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
public class ImageServiceImpl implements ImageService{
    private final Cloudinary cloudinary;
    private final CloudinaryService cloudinaryService;
    private final ImagesRepository repository;

    @Override
    public Images save(MultipartFile file, Product product) throws IOException {
        Images image = new Images();
        image.setUrl(cloudinaryService.upload(file).get("secure_url").toString());
        image.setProduct(product);
        return(repository.save(image));

    }
    
}
