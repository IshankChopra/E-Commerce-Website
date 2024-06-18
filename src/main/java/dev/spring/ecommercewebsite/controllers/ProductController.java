package dev.spring.ecommercewebsite.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @PostMapping("/products")
    public void createProduct(){

    }

    @GetMapping("/product/{id}")
    public void getProductDetails(@PathVariable("id") Long productId){

    }

    @GetMapping("/products")
    public void getAllProduct(){

    }

    public void updateProduct(){

    }

}
