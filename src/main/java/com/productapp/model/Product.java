package com.productapp.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(generator = "product_seq",strategy = GenerationType.AUTO)
    @SequenceGenerator(name="product_seq",sequenceName = "product_sequence",initialValue = 1,allocationSize = 1)
    private Integer productId;
    private String name;
    private double price;
    private String category;
    private String productImg;
    private String brand;
    private double rating;
    private String description;

    public Product(String name, double price, String category, String productImg, String brand, double rating, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.productImg = productImg;
        this.brand = brand;
        this.rating = rating;
        this.description = description;
    }
}
