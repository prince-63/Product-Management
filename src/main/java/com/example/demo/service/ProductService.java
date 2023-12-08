package com.example.demo.service;

import com.example.demo.product.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void save(Product product) {
        product.setDate(new Date());
        productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }

    public boolean deleteAllProduct() {
        productRepository.deleteAll();
        return true;
    }

    public boolean saveAll(List<Product> products) {
        // setting all product time
        for (Product product : products) {
            product.setDate(new Date());
        }
        productRepository.saveAll(products);
        return true;
    }

    public boolean deleteById(String id) {
        boolean exists = productRepository.existsById(id);
        if (exists) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Product> update(String id, Product product) {
        return productRepository.findById(id);
    }
}
