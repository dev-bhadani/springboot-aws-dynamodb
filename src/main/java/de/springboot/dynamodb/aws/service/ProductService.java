package de.springboot.dynamodb.aws.service;


import de.springboot.dynamodb.aws.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductList();
    Product saveProduct(Product product);
    Product getProductById(String id);
    Product updateProduct(String id,Product product);
    void deleteProduct(String id);
}
