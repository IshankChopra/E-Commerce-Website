package dev.spring.ecommercewebsite.services;

import dev.spring.ecommercewebsite.dtos.FakeStoreProductDto;
import dev.spring.ecommercewebsite.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        FakeStoreProductDto fakeStoreProduct = restTemplate.getForObject("http://fakestoreapi.com/products/" + productId,
                FakeStoreProductDto.class);

        return fakeStoreProduct.toProduct();
    }



}
