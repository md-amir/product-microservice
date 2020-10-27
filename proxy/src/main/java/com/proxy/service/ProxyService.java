package com.proxy.service;

import com.proxy.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "gateway")
public interface ProxyService {

    @GetMapping("/list/products")
    public List<ProductDto> getAllProducts() ;

    @GetMapping("/details/products/{id}")
    public ProductDto getProduct(@PathVariable Long id);
}
