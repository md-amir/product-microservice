package com.list.controller;

import com.list.entity.Product;
import com.list.service.ProductService;
import com.list.taskinterface.ProductTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController implements ProductTask {

    @Autowired
    private ProductService service;

    @Override
    @GetMapping("")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @Override
    @PostMapping("")
    public Product saveProduct(Product product) {
        return service.saveProduct(product);
    }
}
