package com.productmanagement.proman.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productmanagement.proman.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>
{
    
}
