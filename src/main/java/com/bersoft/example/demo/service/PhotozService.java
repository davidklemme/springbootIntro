package com.bersoft.example.demo.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bersoft.example.demo.model.Photo;
import com.bersoft.example.demo.repository.PhotozRepository;

@Service
public class PhotozService {

    private final PhotozRepository photozRepository;

    public PhotozService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }

    public Iterable<Photo> get() {
        return photozRepository.findAll();
    }

    public Photo get(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photozRepository.deleteById(id);
        return;
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo(null, null);
        photo.setContentType(contentType);
        photo.setFilename(fileName);
        photo.setData(data);
        photozRepository.save(photo);
        return photo;
    }

}
