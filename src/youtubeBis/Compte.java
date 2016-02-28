package youtubeBis;

import java.io.Serializable;
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
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
public class Compte implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;

	@NotNull( message = "Veuillez saisir un nom d'utilisateur" )
	private String userName;

	@NotNull( message = "Veuillez saisir un mot de passe" )
	@Pattern(regexp = ".*(?=.{8,})(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*", message = "Le mot de passe saisi n'est pas assez sécurisé")
	private String password;

	@NotNull( message = "Veuillez saisir votre nom" )
	private String nom;

	@NotNull( message = "Veuillez saisir votre prénom" )
	private String prenom;

	@NotNull( message = "Veuillez saisir une adresse mail" )
	private String mail;
	
	@Temporal(TemporalType.DATE)
	@NotNull( message = "Veuillez saisir une date de naissance (ex : 01/01/1970)" )
	private Date dateNaissance;
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "compte")
//	private List<Chaine> chaines;
	
	public Compte(){}
	
	public Compte(String userName, String password,String nom, String prenom, String mail, String dateNaissance) {
		this.userName = userName;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dateNaissance =  df.parse(dateNaissance);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//this.chaines = new ArrayList<Chaine>();
	}
//	
//	@PostLoad
//	@PostPersist
//	@PostUpdate
//	public Chaine ajouterChaine(String nomChaine) {
//		Chaine chaine = new Chaine(nomChaine);
//		chaines.add(chaine);
//		return chaine;
//	}
//	
	

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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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

//	public List<Chaine> getChaines() {
//		return chaines;
//	}
//
//	public void setChaines(List<Chaine> chaines) {
//		this.chaines = chaines;
//	}

	
}
