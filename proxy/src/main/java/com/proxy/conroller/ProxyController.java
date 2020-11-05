package com.proxy.conroller;

import com.proxy.dto.ProductDto;
import com.proxy.redirect.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProxyController {

    @Autowired
    private Proxy proxy;

    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return proxy.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public ProductDto getProduct(@PathVariable Long id){
        return proxy.getProduct(id);
    }

    @GetMapping("/abc/{id}")
    public Integer getRatins(@PathVariable Long id){
        return proxy.getRatings(id);
    }
}
