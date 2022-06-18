package com.example.demo.controller;


import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/value")
    public ResponseEntity<List<ProductEntity>> findAll(){
        List<ProductEntity> list = productService.findAll();

                return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
