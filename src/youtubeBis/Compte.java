package youtubeBis;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Compte {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	private String mail;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "compte")
	private List<Chaine> chaines;
	
	public Compte(String nom, String prenom, String mail, String dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dateNaissance =  df.parse(dateNaissance);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		this.chaines = new ArrayList<Chaine>();
	}

	public Chaine ajouterChaine(String nomChaine) {
		Chaine chaine = new Chaine(nomChaine);
		chaines.add(chaine);
		return chaine;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public List<Chaine> getChaines() {
		return chaines;
	}

	public void setChaines(List<Chaine> chaines) {
		this.chaines = chaines;
	}
	
	public Long getID(){
		return id;
	}

	
}
