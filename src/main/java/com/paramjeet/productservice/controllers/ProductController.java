package com.paramjeet.productservice.controllers;

import com.paramjeet.productservice.dtos.ExceptionDto;
import com.paramjeet.productservice.dtos.FakeStoreProductDto;
import com.paramjeet.productservice.models.Product;
import com.paramjeet.productservice.services.FakeStoreProductServices;
import com.paramjeet.productservice.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//This controller is capable to host HTTP APIs
@RestController
//localhost:8080?products -> ProductController
@RequestMapping("/products")

public class ProductController {
    private final ProductService productService;
    ProductController(ProductService productService){
        this.productService= productService;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @GetMapping("")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
