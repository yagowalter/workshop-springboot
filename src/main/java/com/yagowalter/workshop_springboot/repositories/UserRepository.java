package com.yagowalter.workshop_springboot.repositories;

import com.yagowalter.workshop_springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
