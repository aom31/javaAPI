package com.example.demo.controller;


import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/findall")
    public ResponseEntity<List<ProductEntity>> findAll(){
        List<ProductEntity> list = productService.findAll();

                return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ProductEntity create(@RequestBody ProductEntity product){
        return productService.create(product);
    }

    @PutMapping("/update/{id}")
    public ProductEntity update(@PathVariable("id") Long id, @RequestBody ProductEntity product){
        product.setId(id);
        return productService.create(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        productService.delete(id);
    }


}
