package org.example.productordertdd.payment;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.example.productordertdd.payment.application.service.PaymentRequest;

public class PaymentSteps {
    public static PaymentRequest 주문결제요청_생성() {
        final Long orderId = 1L;
        final String cardNumber = "1234-1234-1234-1234";
        return new PaymentRequest(orderId, cardNumber);
    }

    public static ExtractableResponse<Response> 주문결제요청(PaymentRequest request) {
        return RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/payments")
                .then().log().all().extract();
    }
}
