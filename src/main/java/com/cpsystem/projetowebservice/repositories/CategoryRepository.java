package com.cpsystem.projetowebservice.repositories;

import com.cpsystem.projetowebservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
