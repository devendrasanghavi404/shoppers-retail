package com.shoppers.shoppersproductservice.repository;

import com.shoppers.shoppersproductservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
    @Query("{'productId': ?0, 'productName': ?1}")
    Product findByIdAndName(Long id, String name);

}


