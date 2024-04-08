package com.paramjeet.productservice.exception;

import lombok.Getter;

@Getter
public class ProductNotFoundException extends RuntimeException{
    private Long id;
    public ProductNotFoundException(Long id, String m){
        super(m);
        this.id= id;
    }
}
