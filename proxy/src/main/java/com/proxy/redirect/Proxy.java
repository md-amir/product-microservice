package com.proxy.redirect;

import com.proxy.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("gateway")
public interface Proxy {
    @GetMapping("/list/products")
    public List<ProductDto> getAllProducts() ;

    @GetMapping("/details/products/{id}")
    public ProductDto getProduct(@PathVariable Long id);

    @GetMapping("/ratings/product/ratings/{id}")
    public Integer getRatings(@PathVariable Long id);
}
