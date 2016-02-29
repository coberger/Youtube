package youtubeBis;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categorie implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	
	private String nom;
	
	public Categorie(){}

	public Categorie(String n) {
		nom = n;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(id+"");
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Categorie ? equals((Categorie)obj) : false;
	}
	
	public boolean equals(Categorie obj){
		return obj.getId() != null && getId() != null ? obj.getId().equals(this.getId()) : obj.getNom().equals(getNom());
	}
}
