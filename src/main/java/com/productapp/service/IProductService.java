package com.productapp.service;

import com.productapp.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    List<Product> getAll();
    List<Product> getByBrand(String brand);
    List<Product> getByCategory(String category);
    Product getById(int productId);
    void updateProduct(Product product);
    void deleteProduct(int productId);
}
