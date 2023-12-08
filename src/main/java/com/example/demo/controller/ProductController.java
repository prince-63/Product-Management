package com.example.demo.controller;

import com.example.demo.product.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping
    public boolean save(@RequestBody Product product) {
        productService.save(product);
        return true;
    }

    @PostMapping("all")
    public boolean saveAll(@RequestBody List<Product> products) {
        return productService.saveAll(products);
    }

    @DeleteMapping
    public boolean deleteAllProduct() {
        return productService.deleteAllProduct();
    }

    @DeleteMapping("id/{id}")
    public boolean deleteById(@PathVariable String id) {
        return productService.deleteById(id);
    }

    @GetMapping("id/{id}")
    public Product findById(@PathVariable String id) {
        return productService.findById(id).orElse(null);
    }

    @PutMapping("id/{id}")
    public boolean update(@PathVariable String id, @RequestBody Product product) {
        Product oldProduct = productService.update(id, product).orElse(null);
        if (oldProduct != null) {
            oldProduct.setProductName(!product.getProductName().equals("") && product.getProductName() != null ? product.getProductName() : oldProduct.getProductName());
            oldProduct.setProductDesc(!product.getProductDesc().equals("") && product.getProductDesc() != null ? product.getProductDesc() : oldProduct.getProductDesc());
            productService.save(oldProduct);
            return true;
        }
        return false;
    }
}
