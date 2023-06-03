package com.shoppers.shoppersproductservice.controller;

import com.shoppers.shoppersproductservice.dto.ProductRequestDto;
import com.shoppers.shoppersproductservice.model.Product;
import com.shoppers.shoppersproductservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ProductController {

    @Autowired
    ProductService productService;


    @PostMapping(value = "product")
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequestDto productDto) {
        return ResponseEntity.ok(productService.createProduct(productDto));
    }

    @GetMapping(value = "products")
    public ResponseEntity<List<Product>> fetchAllProducts() {
        List<Product> productList = productService.fetchProducts();
        return ResponseEntity.ok(productList);
    }

    @PutMapping(value = "/product/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductRequestDto productDto) {
        return ResponseEntity.ok(productService.updateProduct(productId, productDto));
    }

    @DeleteMapping("/products/{id}/{name}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id, @PathVariable String name) {
        Product productToDelete = productService.deleteProduct(id, name);
        return ResponseEntity.ok(productToDelete);

    }


}


