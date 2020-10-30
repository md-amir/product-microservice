package com.ratings.controller;

import com.ratings.service.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingsController {
    @Autowired
    private RatingsService service;

    @GetMapping("/product/ratings/{id}")
    public int getRating(@PathVariable Long id){
        return service.getRating(id);
    }
}
