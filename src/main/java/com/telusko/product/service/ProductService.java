package com.telusko.product.service;

import com.telusko.product.model.Product;
import com.telusko.product.repo.ProductRepo;
import jakarta.persistence.Id;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    @Getter
//    List<Product> products = new ArrayList<>
//            (Arrays.asList(
//            new Product(1, "Camera", 20000),
//            new Product(2, "Monitor", 25000),
//            new Product(3, "Speaker", 5000))
//            );

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    public void addProducts(List<Product> prod) {
        repo.saveAll(prod);
    }
}
