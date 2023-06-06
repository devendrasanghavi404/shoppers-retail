package com.shoppers.shoppersproductservice.dto;

import lombok.Builder;


public class ProductRequestDto {

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

    public ProductRequestDto(Long productId, String productName, String description, String category, Double price, String createdAt, String updatedAt, String status, String imageURL, String brand) {
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

    public ProductRequestDto() {
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "ProductRequestDto{" +
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
