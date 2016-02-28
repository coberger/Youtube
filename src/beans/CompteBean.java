package beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import DAO.CompteDAO;
import youtubeBis.Compte;

@ManagedBean
@SessionScoped
public class CompteBean implements Serializable{
	
	private Compte currentCompte = new Compte();
	
	public Compte getCurrentCompte(){
		return currentCompte;
	}
	
	public String inscrire(){
		CompteDAO dao = new CompteDAO();
		dao.add(currentCompte);
		return "home";
	}
	
	public String connexion(){
		CompteDAO dao = new CompteDAO();
		Compte c = dao.verify(currentCompte.getUserName(), currentCompte.getPassword());
		if(c == null){
			currentCompte = new Compte();
			FacesMessage message = new FacesMessage( "Erreur lors de l'authentification." );
	        FacesContext.getCurrentInstance().addMessage( null, message );
	        return "";
		}else{
			currentCompte = c;
			return "home";
		}
	}
	

	public String deconnexion(){
		currentCompte = null;
		currentCompte = new Compte();
		return "home";
	}

}
