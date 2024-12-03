package com.productmanagement.proman.Entity;

// import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "return_and_refund")
public class ReturnRefund{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "reason_for_return_refund")
    private String reasonForReturnRefund;

    @Column(name = "refund_method")
    private String refundMethod;

    @Column(name = "additional_notes")
    private String additionalNotes;

    // Getters aur Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getReasonForReturnRefund() {
        return reasonForReturnRefund;
    }

    public void setReasonForReturnRefund(String reasonForReturnRefund) {
        this.reasonForReturnRefund = reasonForReturnRefund;
    }

    public String getRefundMethod() {
        return refundMethod;
    }

    public void setRefundMethod(String refundMethod) {
        this.refundMethod = refundMethod;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }
}
