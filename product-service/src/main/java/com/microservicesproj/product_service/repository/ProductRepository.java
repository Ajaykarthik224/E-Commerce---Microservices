package com.microservicesproj.product_service.repository;

import com.microservicesproj.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
