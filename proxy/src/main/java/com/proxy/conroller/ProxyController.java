package com.proxy.conroller;

import com.proxy.dto.ProductDto;
import com.proxy.service.ProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProxyController {

    @Autowired
    private ProxyService service;

    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public ProductDto getProduct(@PathVariable Long id){
        return service.getProduct(id);
    }
}
