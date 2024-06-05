package org.example.productordertdd.order;

import org.example.productordertdd.product.ProductService;
import org.example.productordertdd.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;


    @Test
    void 상품주문() {
        productService.addProduct(ProductSteps.상품등록요청_생성());
        final var request = 상품주문요청_생성();

        orderService.createOrder(request);
    }

    public static CreateOrderRequest 상품주문요청_생성() {
        final Long productId = 1L;
        final int quantity = 2;
        final CreateOrderRequest request = new CreateOrderRequest(productId, quantity);
        return request;
    }
}
