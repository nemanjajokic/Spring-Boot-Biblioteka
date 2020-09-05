package io.neca.dto;

import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class BibliotekarDto {

	private long id;
	private String ime;
	private Set<KorisnikDto> korisnik;
	
}
