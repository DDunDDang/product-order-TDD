package org.example.productordertdd.product.adapter;

import org.example.productordertdd.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
