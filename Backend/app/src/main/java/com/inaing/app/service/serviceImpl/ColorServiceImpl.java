package com.inaing.app.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.inaing.app.entity.Color;
import com.inaing.app.repository.ColorRepository;
import com.inaing.app.service.ColorService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ColorServiceImpl implements ColorService{
    private final ColorRepository repository;

    @Override
    public Color getColor(Long id) {
        if(repository.findById(id).isPresent()) return repository.findById(id).get();
        return null;
    }
    
}
