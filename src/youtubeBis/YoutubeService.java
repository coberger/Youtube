package youtubeBis;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Stateless
public class YoutubeService {
	
	@PersistenceContext(unitName = "bdd_youtube", type = PersistenceContextType.EXTENDED)
	EntityManager em;
	
	public Compte creerCompte(String userName,String password,String nom, String prenom, String mail, String dateNaissance){
		Compte compte = new Compte(userName, password, nom, prenom, mail, dateNaissance);
		em.persist(compte);
		return (compte);
	}
	
	public Compte updateCompte(Compte c){
		Compte compte = em.merge(c);
		return (compte);
	}
	
	public void removeCompte(Compte compte){
		em.remove(compte);
	}
	
	public Compte getCompte(String userName){
		CriteriaBuilder queryBuilder = em.getCriteriaBuilder();
		CriteriaQuery qdef = queryBuilder.createQuery();
		Root<Compte> compteRoot = qdef.from(Compte.class);
		Compte compte =qdef.select(compteRoot.get(Compte_.userName).equal(userName));
		return null;
		
	}
	
	
	public Chaine getChaine(String name){
		CriteriaBuilder queryBuilder = em.getCriteriaBuilder();
		CriteriaQuery qdef = queryBuilder.createQuery();
		Root<Chaine> chaineRoot = qdef.from(Chaine.class);
		Chaine compte =qdef.select(chaineRoot.get(Chaine_.nom).equal(name));
		return null;
	}
	
	

}
