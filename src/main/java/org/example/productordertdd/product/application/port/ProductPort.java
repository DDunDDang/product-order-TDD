package org.example.productordertdd.product.application.port;

import org.example.productordertdd.product.domain.Product;

public interface ProductPort {
    void save(final Product product);
    Product getProduct(Long productId);
}
