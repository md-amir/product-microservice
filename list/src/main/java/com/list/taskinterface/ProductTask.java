package com.list.taskinterface;

import com.list.entity.Product;

import java.util.List;

public interface ProductTask {
    public List<Product> getAllProducts();
    public Product saveProduct(Product product);
}
