package com.productmanagement.proman.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productmanagement.proman.Entity.PaymentDetails;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Long> {
    
}
