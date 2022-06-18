package com.example.demo.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
@Data
public class ProductEntity implements Serializable {

    @Id
    @GeneratedValue( strategy =  GenerationType.AUTO)
    private Long id;

    private String productName;
    private Double price;
    private String Category;

}
