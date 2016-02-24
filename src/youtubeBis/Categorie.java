package youtubeBis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	public Categorie(){}
	public Categorie(String n) {
		nom = n;
	}
}
