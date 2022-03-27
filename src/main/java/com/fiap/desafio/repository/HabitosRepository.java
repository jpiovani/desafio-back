package com.fiap.desafio.repository;

import com.fiap.desafio.domain.Habitos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitosRepository extends JpaRepository<Habitos, Integer> {
}
