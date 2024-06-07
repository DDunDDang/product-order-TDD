package org.example.productordertdd.payment;

interface PaymentGateway {
    void excute(int totalPrice, String cardNumber);
}
