package com.productmanagement.proman.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productmanagement.proman.Entity.Product;

public interface  ProductRepository extends JpaRepository<Product, Long> {
    
}
