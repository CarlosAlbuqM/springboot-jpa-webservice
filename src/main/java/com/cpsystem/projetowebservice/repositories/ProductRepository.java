package com.cpsystem.projetowebservice.repositories;

import com.cpsystem.projetowebservice.entities.Category;
import com.cpsystem.projetowebservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
