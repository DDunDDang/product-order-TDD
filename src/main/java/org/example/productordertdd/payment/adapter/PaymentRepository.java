package org.example.productordertdd.payment.adapter;

import org.example.productordertdd.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

interface PaymentRepository extends JpaRepository<Payment, Long> {
}
