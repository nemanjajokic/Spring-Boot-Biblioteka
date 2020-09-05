package io.neca.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class Komentar {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long id;
	private String sadrzaj;
	private Date datumKomentara;
	@ManyToOne @JoinColumn(name = "korisnik_id", nullable = true)
	private Korisnik korisnik;
	@ManyToOne @JoinColumn(name = "knjiga_id", nullable = true)
	private Knjiga knjiga;
	
}
