package com.codefall.shop.jpa.repositories;

import com.codefall.shop.jpa.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {
  ProductEntity findByName(String name);

}
