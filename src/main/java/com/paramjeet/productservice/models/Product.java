package com.paramjeet.productservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //generates all the constructors
@NoArgsConstructor //no args constructor
//@Entity

public class Product {
//    @Id
    private Long id;
    private String title;
    private String description;
    private Double price;

//    @ManyToOne
    private Category category;
    private String image;


}
