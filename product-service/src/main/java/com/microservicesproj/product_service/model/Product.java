package com.microservicesproj.product_service.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "products")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
