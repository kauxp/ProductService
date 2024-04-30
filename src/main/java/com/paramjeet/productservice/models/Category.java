package com.paramjeet.productservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Category {
    @Id
//    @Generated(strategy= GenerationType.AUTO)
    private Long id;
    private String title;

    @OneToMany
//    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;
}
