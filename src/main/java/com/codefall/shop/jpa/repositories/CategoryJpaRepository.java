package com.codefall.shop.jpa.repositories;

import com.codefall.shop.jpa.entities.CategoryEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<CategoryEntity,Long> {
  List<CategoryEntity> finAllByName(String name);

}
