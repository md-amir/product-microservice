package com.ratings.repository;

import com.ratings.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingsRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT rating FROM Product  WHERE id = ?1", nativeQuery = true)
    public int getRating(Long id);
}
