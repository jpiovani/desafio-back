package com.fiap.desafio.repository;

import com.fiap.desafio.domain.Exames;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamesRepository extends JpaRepository<Exames, Integer> {
}
