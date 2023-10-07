package com.example.demo.dao;

import com.example.demo.entities.Carts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartsRepository extends JpaRepository<Carts, Long>{
}
