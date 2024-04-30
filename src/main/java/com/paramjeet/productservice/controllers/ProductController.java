package com.paramjeet.productservice.controllers;

import com.paramjeet.productservice.dtos.ExceptionDto;
import com.paramjeet.productservice.dtos.FakeStoreProductDto;
import com.paramjeet.productservice.models.Product;
import com.paramjeet.productservice.services.FakeStoreProductServices;
import com.paramjeet.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This controller is capable to host HTTP APIs
@RestController
//localhost:8080?products -> ProductController
@RequestMapping("/products")

public class ProductController {
    private final ProductService productService;
    ProductController(@Qualifier("selfProductService") ProductService productService){
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

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
