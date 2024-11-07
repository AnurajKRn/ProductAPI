package com.telusko.product.repo;

import com.telusko.product.model.Product;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
