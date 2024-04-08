package com.paramjeet.productservice.dtos;

import com.paramjeet.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Category category;
    private String image;
}
