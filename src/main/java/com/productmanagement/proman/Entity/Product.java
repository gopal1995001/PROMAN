package com.productmanagement.proman.Entity;

// import java.sql.Blob;

// import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_title")
    private String productTitle;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "price")
    private Double price;

    @Column(name = "category")
    private String category;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "image")
    // @Lob
    private byte[] image;
    // Getters and Setters
}

