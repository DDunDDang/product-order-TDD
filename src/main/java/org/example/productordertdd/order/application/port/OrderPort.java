package org.example.productordertdd.order.application.port;

import org.example.productordertdd.order.domain.Order;
import org.example.productordertdd.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public interface OrderPort {
    Product getProductById(final Long productId);

    void save(Order order);
}
