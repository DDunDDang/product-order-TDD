package org.example.productordertdd.order;

import org.example.productordertdd.product.Product;
import org.springframework.stereotype.Component;

@Component
interface OrderPort {
    Product getProductById(final Long productId);

    void save(Order order);
}
