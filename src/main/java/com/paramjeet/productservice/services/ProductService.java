package com.paramjeet.productservice.services;

import com.paramjeet.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
