package org.example.productordertdd.payment.application.port;

import org.example.productordertdd.order.domain.Order;
import org.example.productordertdd.payment.domain.Payment;

public interface PaymentPort {
    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
