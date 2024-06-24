package dev.spring.ecommercewebsite.services;

import dev.spring.ecommercewebsite.models.Product;

public interface ProductService {
    public Product getSingleProduct(Long productId);

    public Product createProduct(String title,
                                 String description,
                                 String category,
                                 double price,
                                 String image);
}
