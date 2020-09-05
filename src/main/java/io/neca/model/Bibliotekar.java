package io.neca.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString
public class Bibliotekar {
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long id;
	private String ime;
	@OneToMany(mappedBy = "bibliotekar")
	private Set<Korisnik> korisnik;
	
}
