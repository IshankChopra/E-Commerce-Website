package dev.spring.ecommercewebsite.services;

import dev.spring.ecommercewebsite.dtos.FakeStoreProductDto;
import dev.spring.ecommercewebsite.models.Category;
import dev.spring.ecommercewebsite.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    public Product createProduct(String title,
                                 String description,
                                 String category,
                                 double price,
                                 String image){

        FakeStoreProductDto fakeStoreProductDto=new FakeStoreProductDto();
        fakeStoreProductDto.setTitle(title);
        fakeStoreProductDto.setCategory(category);
        fakeStoreProductDto.setPrice(price);
        fakeStoreProductDto.setImage(image);
        fakeStoreProductDto.setDescription(description);

        FakeStoreProductDto response=restTemplate.postForObject("https://fakestoreapi.com/products",
                fakeStoreProductDto,
                FakeStoreProductDto.class);
        return response.toProduct();
    }


    public List<String> getallcategory(){
        List<String> output=restTemplate.getForObject("https://fakestoreapi.com/products/categories",
                List.class);

        return output;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

}
