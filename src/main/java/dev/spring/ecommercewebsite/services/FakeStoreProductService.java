package dev.spring.ecommercewebsite.services;

import dev.spring.ecommercewebsite.models.Product;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements ProductService{

    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }
}
