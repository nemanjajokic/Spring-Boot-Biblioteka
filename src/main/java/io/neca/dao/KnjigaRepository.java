package io.neca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.neca.model.Knjiga;

public interface KnjigaRepository extends JpaRepository<Knjiga, Long> {

}
