package com.anchal.sejalecommerce2.dao;

import com.anchal.sejalecommerce2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
