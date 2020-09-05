package io.neca.dto;

import java.util.Date;

import io.neca.model.Knjiga;
import io.neca.model.Korisnik;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class KomentarDto {

	private long id;
	private String sadrzaj;
	private Date datumKomentara;
	private Korisnik korisnik;
	private Knjiga knjiga;
	
}
