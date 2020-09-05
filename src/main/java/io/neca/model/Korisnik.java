package io.neca.model;

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
public class Korisnik {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long id;
	private String ime;
	@ManyToOne @JoinColumn(name = "bibliotekar_id", nullable = false)
	private Bibliotekar bibliotekar;
	@OneToMany(mappedBy = "korisnik")
	private Set<Knjiga> knjiga;
	@OneToMany(mappedBy = "korisnik")
	private Set<Komentar> komentar;
	
}
