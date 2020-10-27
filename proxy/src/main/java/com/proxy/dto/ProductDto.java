package com.proxy.dto;

public class ProductDto {
    private Long id;
    private String name;
    private int rating;

    public ProductDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ProductDto(Long id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }


}
