package io.neca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.neca.model.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long>{

}
