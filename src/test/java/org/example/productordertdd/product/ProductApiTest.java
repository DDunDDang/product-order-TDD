package org.example.productordertdd.product;

import org.assertj.core.api.AssertionsForClassTypes;
import org.example.productordertdd.ApiTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class ProductApiTest extends ApiTest {

    @Test
    void 상품등록() {
        final var request = ProductSteps.상품등록요청_생성();

        final var response = ProductSteps.상품등록요청(request);

        AssertionsForClassTypes.assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }
}
