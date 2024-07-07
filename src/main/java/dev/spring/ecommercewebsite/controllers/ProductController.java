package dev.spring.ecommercewebsite.controllers;
import java.util.*;
import dev.spring.ecommercewebsite.dtos.CreateProductRequestDto;
import dev.spring.ecommercewebsite.models.Product;
import dev.spring.ecommercewebsite.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public List<Product> getAllProduct(){
        return productService.getProducts();
    }

    public void updateProduct(){

    }


    @GetMapping("/category")
    public List<String> getallcategory(){
        return productService.getallcategory();
    }


}
