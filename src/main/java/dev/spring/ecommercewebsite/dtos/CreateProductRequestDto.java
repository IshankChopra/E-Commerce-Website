package dev.spring.ecommercewebsite.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateProductRequestDto {
    private String description;
    private String title;
    private String image;
    private String category;
    private double price;

}
