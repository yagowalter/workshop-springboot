package com.yagowalter.workshop_springboot.repositories;

import com.yagowalter.workshop_springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
