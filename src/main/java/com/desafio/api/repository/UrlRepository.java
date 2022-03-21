package com.desafio.api.repository;

import com.desafio.api.dominio.UrlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlRepository extends JpaRepository<UrlEntity, Long> {
    Optional<UrlEntity> findByUrlEncurtada(String urlEncurtada);
}
