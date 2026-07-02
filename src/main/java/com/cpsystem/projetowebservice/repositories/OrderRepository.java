package com.cpsystem.projetowebservice.repositories;

import com.cpsystem.projetowebservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
