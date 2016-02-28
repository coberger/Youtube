package DAO;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import youtubeBis.Compte;

public class CompteDAO extends MyDAO{

	public CompteDAO(){
		super();
	}
	
	public void add(Compte c){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
        em.persist(c);
        tx.commit();
	}
	
	public void add(List<Compte> cs){
		for(Compte c : cs){
			add(c);
		}
	}
	
	public Compte getCompteByUsername(String username){
		Compte c = null;
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query CompteQuery = em.createQuery("select d from Compte d where d.userName LIKE '"+username+"'");
        List<Compte> comptes = CompteQuery.getResultList();
        if(!comptes.isEmpty()){
        	c = comptes.get(0);
        }
        tx.commit();
        return c;
	}
	
	public Compte verify(String username, String password){
		Compte c = getCompteByUsername(username);
		return (c != null && c.getPassword().equals(password)) ? c : null;
	}
	
	public List<Compte> getAllCompte(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query allCompteQuery = em.createQuery("select d from Compte d");
        List<Compte> list = allCompteQuery.getResultList();
        tx.commit();
        return list;
	}	

}
