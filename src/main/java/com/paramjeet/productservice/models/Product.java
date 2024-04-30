package com.paramjeet.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Getter
@Setter
@AllArgsConstructor //generates all the constructors
@NoArgsConstructor //no args constructor
@Entity

public class Product {
    @Id
//    @Generated(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double price;

    @ManyToOne
    private Category category;
    private String image;


}
