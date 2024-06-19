package dev.spring.ecommercewebsite;

import dev.spring.ecommercewebsite.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceWebsiteApplication {

    public static void main(String[] args) {
        Product p=new Product();
        SpringApplication.run(ECommerceWebsiteApplication.class, args);
    }

}

