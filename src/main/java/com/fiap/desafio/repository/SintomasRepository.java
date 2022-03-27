package com.fiap.desafio.repository;

import com.fiap.desafio.domain.Sintomas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SintomasRepository extends JpaRepository<Sintomas, Integer> {
}
