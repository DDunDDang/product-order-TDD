package org.example.productordertdd.payment.adapter;

interface PaymentGateway {
    void excute(int totalPrice, String cardNumber);
}
