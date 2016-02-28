package DAO;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import youtubeBis.Categorie;

public class CategorieDAO extends MyDAO{

	
	public CategorieDAO() {
		super();
	}
	
	public void add(Categorie c){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
        em.persist(c);
        tx.commit();
	}
	
	public void add(List<Categorie> cs){
		for(Categorie c : cs){
			add(c);
		}
	}
	
	public List<Categorie> getAllCategorie(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query allCategorieQuery = em.createQuery("select d from Categorie d");
        List<Categorie> list = allCategorieQuery.getResultList();
        tx.commit();
        return list;
	}	
	
	public void deleteAll(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query allCategorieQuery = em.createQuery("delete from Categorie");
        allCategorieQuery.executeUpdate();
        tx.commit();
	}
}
