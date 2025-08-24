package com.microservicesproj.product_service.controller;

import com.microservicesproj.product_service.dto.ProductRequest;
import com.microservicesproj.product_service.dto.ProductResponse;
import com.microservicesproj.product_service.model.Product;
import com.microservicesproj.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
//@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createRequest(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProduct() {
       return productService.getAllProduct();
    }

}
