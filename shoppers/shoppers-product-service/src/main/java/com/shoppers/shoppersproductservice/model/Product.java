package com.shoppers.shoppersproductservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String description;
    private String category;
    private Double price;
    private String createdAt;
    private String updatedAt;
    private String status;
    private String imageURL;
    private String brand;

    public Product() {
    }

    public Product(Long productId, String productName, String description, String category, Double price, String createdAt, String updatedAt, String status, String imageURL, String brand) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
        this.imageURL = imageURL;
        this.brand = brand;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", status='" + status + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", Brand='" + brand + '\'' +
                '}';
    }
}
