package io.neca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.neca.model.Komentar;

public interface KomentarRepository extends JpaRepository<Komentar, Long>{

}
