package com.ratings.service;

import com.ratings.repository.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class RatingsService {
    @Autowired
    private RatingsRepository repository;

    public int getRating(Long id){
        return repository.getRating(id);
    }
}
