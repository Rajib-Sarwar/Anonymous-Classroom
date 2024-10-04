package org.codingskills.productservice.services;

import org.codingskills.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product createProduct(Product product);

    Product updateProduct(Product product);

    Product replaceProduct(Long id, Product product);

    Product deleteProductById(Long id);

    String deleteProduct(Long id);
}
