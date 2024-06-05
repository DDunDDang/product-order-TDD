package org.example.productordertdd.order;

import java.util.HashMap;
import java.util.Map;

class OrderRepository {
    private Map<Long, Order> persistance = new HashMap<>();
    private Long sequence = 0L;

    public void save(Order order) {
        order.assignId(++sequence);
        persistance.put(order.getId(), order);
    }
}
