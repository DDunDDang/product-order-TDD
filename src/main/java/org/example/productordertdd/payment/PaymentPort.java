package org.example.productordertdd.payment;

import org.example.productordertdd.order.Order;

interface PaymentPort {
    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
