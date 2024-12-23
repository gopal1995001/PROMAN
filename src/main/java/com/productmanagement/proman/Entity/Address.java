package com.productmanagement.proman.Entity;

// import org.hibernate.annotations.processing.Pattern;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
   
  
  
  @Column(name = "street")
  private String street;
  
  @Column(name = "city")
  private String city;
  
  @Column(name = "state")
  private String state;
  
  @Column(name = "country")
  private String country;
  
  @Column(name = "zip_code")
  @Digits(integer = 5, fraction = 0)
  private String zipCode;

}