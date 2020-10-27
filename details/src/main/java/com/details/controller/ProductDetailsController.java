package com.details.controller;

import com.details.entity.Product;
import com.details.productinterface.ProductTask;
import com.details.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@RequestMapping("/products")
public class ProductDetailsController implements ProductTask {

    @Autowired
    private ProductDetailsService service;

    @Override
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return service.getProduct(id);
    }
}
