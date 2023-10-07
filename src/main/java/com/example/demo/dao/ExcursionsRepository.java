package com.example.demo.dao;

import com.example.demo.entities.Excursions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcursionsRepository extends JpaRepository<Excursions, Long> {
}
