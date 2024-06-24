package dev.spring.ecommercewebsite.controllers;

import dev.spring.ecommercewebsite.dtos.CreateProductRequestDto;
import dev.spring.ecommercewebsite.models.Product;
import dev.spring.ecommercewebsite.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }


    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto request){
//        System.out.println(request.getDescription());
        return productService.createProduct(
                request.getTitle(),
                request.getDescription(),
                request.getCategory(),
                request.getPrice(),
                request.getImage()

        );
    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long productId){
        return productService.getSingleProduct(productId);
    }

    @GetMapping("/products")
    public void getAllProduct(){

    }

    public void updateProduct(){

    }

}
