package com.inaing.app.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.inaing.app.entity.Size;
import com.inaing.app.repository.SizeRepository;
import com.inaing.app.service.SizeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SizeServiceImpl implements SizeService{
    private final SizeRepository sizeRepository;

    @Override
    public Size getSize(Long id) {
        if(sizeRepository.findById(id).isPresent()) return sizeRepository.findById(id).get();
        return null;
    }
    
}
