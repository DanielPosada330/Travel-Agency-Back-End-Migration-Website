package com.example.demo.dao;

import com.example.demo.entities.Vacations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationsRepository extends JpaRepository<Vacations, Long> {
}
