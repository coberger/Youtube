package DAO;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import youtubeBis.Categorie;

@Stateful
public class MyDAO {
	
	private static EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("bdd_youtube");
	
	@PersistenceContext(unitName = "bdd_youtube", type = PersistenceContextType.EXTENDED)
    protected EntityManager em;
 
	protected MyDAO(){
		em = emf.createEntityManager();
	}
	
}
