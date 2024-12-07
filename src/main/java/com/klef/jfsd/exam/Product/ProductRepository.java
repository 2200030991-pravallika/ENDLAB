package com.klef.jfsd.exam.Product;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> 
{
    
}