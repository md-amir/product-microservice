package com.details.service;

import com.details.entity.Product;
import com.details.productinterface.ProductTask;
import com.details.repository.ProductDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsService implements ProductTask {

    @Autowired
    private ProductDetailsRepository repository;

    @Override
    public Product getProduct(Long id) {
        return repository.findById(id).orElse(null);
    }
}
