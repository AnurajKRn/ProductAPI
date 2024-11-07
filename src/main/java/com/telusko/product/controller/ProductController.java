package com.telusko.product.controller;

import com.telusko.product.model.Product;
import com.telusko.product.repo.ProductRepo;
import com.telusko.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/")
    public String product(){
        return "Welcome to product";
    }

    @GetMapping("/product")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{Id}")
    public Product getProductById(@PathVariable int Id){
        return service.getProductById(Id);
    }

    @PostMapping("/product")
    public boolean addProduct(@RequestBody Product prod){
        service.addProduct(prod);
        return true;
    }

    @PostMapping("/addProducts")
    public boolean addProducts(@RequestBody List<Product> prod){
        service.addProducts(prod);
        return true;
    }

    @PutMapping("/product")
    public boolean updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
        return true;
    }

    @DeleteMapping("/product/{id}")
    public boolean deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
        return true;
    }
}
