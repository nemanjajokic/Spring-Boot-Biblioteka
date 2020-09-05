package io.neca.dto;

import java.util.Date;

import io.neca.model.Korisnik;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class KnjigaDto {

	private long id;
	private String naziv;
	private String pisac;
	private boolean slobodna;
	private Date datumUzimanja;
	private Korisnik korisnik;
	
}
