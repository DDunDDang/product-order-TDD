package org.example.productordertdd.payment;

import org.example.productordertdd.ApiTest;
import org.example.productordertdd.order.OrderSteps;
import org.example.productordertdd.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PaymentApiTest extends ApiTest {

    @Test
    void 상품주문() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        OrderSteps.상품주문요청(OrderSteps.상품주문요청_생성());
        final var request = PaymentSteps.주문결제요청_생성();

        final var response = PaymentSteps.주문결제요청(request);


        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
    }
}
