package org.example.productordertdd.order;

import org.example.productordertdd.product.Product;

interface OrderPort {
    Product getProductById(final Long productId);

    void save(Order order);
}
