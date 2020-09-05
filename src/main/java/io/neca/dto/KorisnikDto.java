package io.neca.dto;

import java.util.Set;

import io.neca.model.Bibliotekar;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class KorisnikDto {

	private long id;
	private String ime;
	private Bibliotekar bibliotekar;
	private Set<KnjigaDto> knjiga;
	
}
