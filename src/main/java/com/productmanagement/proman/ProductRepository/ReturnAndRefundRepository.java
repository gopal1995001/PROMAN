package com.productmanagement.proman.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productmanagement.proman.Entity.ReturnRefund;

public interface ReturnAndRefundRepository extends JpaRepository<ReturnRefund, Long> {

}
