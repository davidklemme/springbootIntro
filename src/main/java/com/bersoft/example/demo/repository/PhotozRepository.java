package com.bersoft.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.bersoft.example.demo.model.Photo;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}