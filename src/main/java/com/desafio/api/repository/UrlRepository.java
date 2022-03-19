package com.desafio.api.repository;

import com.desafio.api.dominio.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepository extends JpaRepository<Url, Long> {
}
