package io.neca.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class Knjiga {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long id;
	private String naziv;
	private String pisac;
	private boolean slobodna;
	private Date datumUzimanja;
	@ManyToOne @JoinColumn(name = "korisnik_id", nullable = false)
	private Korisnik korisnik;
	@OneToMany(mappedBy = "knjiga")
	private Set<Komentar> komentar;
	
}
