package dev.spring.ecommercewebsite.services;

import dev.spring.ecommercewebsite.models.Product;

import java.util.List;

public interface ProductService {
    public Product getSingleProduct(Long productId);

    public Product createProduct(String title,
                                 String description,
                                 String category,
                                 double price,
                                 String image);

    public List<String> getallcategory();

    public List<Product> getProducts();



}


