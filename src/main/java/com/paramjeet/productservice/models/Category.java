package com.paramjeet.productservice.models;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
//@Entity
public class Category {
//    @Id
    private Long id;
    private String title;
    private String description;
}
