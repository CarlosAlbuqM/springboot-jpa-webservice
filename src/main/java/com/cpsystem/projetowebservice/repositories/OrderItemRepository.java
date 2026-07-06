package com.cpsystem.projetowebservice.repositories;

import com.cpsystem.projetowebservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
