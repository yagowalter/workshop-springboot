package com.yagowalter.workshop_springboot.repositories;

import com.yagowalter.workshop_springboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
