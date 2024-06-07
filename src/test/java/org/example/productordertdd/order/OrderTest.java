package org.example.productordertdd.order;

import org.example.productordertdd.product.DiscountPolicy;
import org.example.productordertdd.product.Product;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OrderTest {

    @Test
    void getTotalPrice() {
        final Order order = new Order(new Product("상품명", 1000, DiscountPolicy.NONE), 2);

        final int totalPrice = order.getTotalPrice();

        assertThat(totalPrice).isEqualTo(2000);
    }

    @Test
    void getDiscountedTotalPrice() {
        final Order order = new Order(new Product("상품명", 1000, DiscountPolicy.FIX_1000_AMOUNT), 2);

        final int totalPrice = order.getTotalPrice();

        assertThat(totalPrice).isEqualTo(0);
    }
}