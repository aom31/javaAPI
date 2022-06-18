package com.example.demo.service;

import com.example.demo.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> findAll();

    ProductEntity create(ProductEntity product);

    void delete(Long id);
}
