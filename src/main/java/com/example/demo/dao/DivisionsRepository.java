package com.example.demo.dao;

import com.example.demo.entities.Divisions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionsRepository extends JpaRepository<Divisions, Long> {
}
