package com.yagowalter.workshop_springboot.repositories;

import com.yagowalter.workshop_springboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
