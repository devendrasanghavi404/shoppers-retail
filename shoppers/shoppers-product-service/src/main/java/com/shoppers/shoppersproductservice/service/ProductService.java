package com.shoppers.shoppersproductservice.service;

import com.shoppers.shoppersproductservice.dto.ProductRequestDto;
import com.shoppers.shoppersproductservice.model.Product;
import com.shoppers.shoppersproductservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product createProduct(ProductRequestDto pdto) {
        Product savedProduct =  Product.builder()
                .productId(pdto.getProductId())
                .productName(pdto.getProductName())
                .description(pdto.getDescription())
                .category(pdto.getCategory())
                .price(pdto.getPrice())
                .createdAt(pdto.getCreatedAt())
                .updatedAt(pdto.getUpdatedAt())
                .status(pdto.getStatus())
                .imageURL(pdto.getImageURL())
                .brand(pdto.getBrand())
                .build();
        System.out.println(savedProduct);
        productRepository.save(savedProduct);
        return savedProduct;
    }

    public List<Product> fetchProducts() {
        return productRepository.findAll();
    }

    public Product updateProduct(Long id, ProductRequestDto pdto) {
        Product productFromRepo = productRepository.findById(id).get();
        return productFromRepo.builder()
                .productId(pdto.getProductId())
                .productName(pdto.getProductName())
                .description(pdto.getDescription())
                .category(pdto.getCategory())
                .price(pdto.getPrice())
                .createdAt(pdto.getCreatedAt())
                .updatedAt(pdto.getUpdatedAt())
                .status(pdto.getStatus())
                .imageURL(pdto.getImageURL())
                .brand(pdto.getBrand())
                .build();
    }

    public Product deleteProduct(Long id, String name) {
        Product productToDelete = productRepository.findByIdAndName(id, name);
        if (productToDelete != null) {
            productRepository.delete(productToDelete);
            return productToDelete;
        } else {
            throw new IllegalArgumentException("Product not found with id and name: " + id + ":" + name);
        }
    }
}
