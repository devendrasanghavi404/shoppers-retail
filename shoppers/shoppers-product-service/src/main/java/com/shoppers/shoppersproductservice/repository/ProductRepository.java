package com.shoppers.shoppersproductservice.repository;

import com.shoppers.shoppersproductservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("SELECT p FROM Product p WHERE p.productId = :id AND p.productName = :name")
    public Product findByIdAndName(@Param("id") Long id, @Param("name") String name);

}
