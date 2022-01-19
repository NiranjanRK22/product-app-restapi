package com.productapp.controllers;

import com.productapp.model.Product;
import com.productapp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("product-api")
public class ProductController {
    private IProductService productService;

    @Autowired
    public void setProductService(IProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public Product addProduct(Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAll() {
         return productService.getAll();
    }

    @GetMapping("/products/brand/{brand}")
    public List<Product> getByBrand(@PathVariable("brand") String brand) {
         return productService.getByBrand(brand);
    }

    @GetMapping("/products/category/{category}")
    public List<Product> getByCategory(@PathVariable("category") String category) {
        return productService.getByCategory(category);
    }

    @GetMapping("/products/id/{productId}")
    public Product getById(@PathVariable("productId") int productId) {
        return productService.getById(productId);
    }

    @PutMapping("/products")
    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable("productId") int productId) {
        productService.deleteProduct(productId);
    }
}
