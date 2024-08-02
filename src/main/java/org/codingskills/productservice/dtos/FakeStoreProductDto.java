package org.codingskills.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
     private Long id;
     private String title;
     private double price;
     private String category;
     private String description;
     private String image;
     private String categoryName;
     private FakeStoreProductDtoRating rating;
}
