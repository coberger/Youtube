package DAO;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import youtubeBis.Categorie;
import youtubeBis.Video;

public class VideoDAO extends MyDAO{

	public VideoDAO(){
		super();
	}
	
	public void add(Video v){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
        em.persist(v);
        tx.commit();
	}
	
	public Video add(Video v, String categorie){
		Categorie cat = null;
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query CategorieQuery = em.createQuery("select d from Categorie d where d.nom='"+categorie+"'");
	    List<Categorie> cats = CategorieQuery.getResultList();
	    if(!cats.isEmpty()){
	    	cat = cats.get(0);
	    }
	    v.setCategorie(cat);
	    em.persist(v);
        tx.commit();
        return v;
	}
	
	public void add(List<Video> vs){
		for(Video v : vs){
			add(v);
		}
	}
	
	public List<Video> getAllVideo(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query allVideoQuery = em.createQuery("select d from Video d");
        List<Video> list = allVideoQuery.getResultList();
        tx.commit();
        return list;
	}	
	
	public void deleteAll(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query allVideoQuery = em.createQuery("delete from Video");
        allVideoQuery.executeUpdate();
        tx.commit();
	}

	public List<Video> findByName(String research) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query allVideoQuery = em.createQuery("select d from Video d WHERE d.name LIKE '%"+research+"%'");
        List<Video> list = allVideoQuery.getResultList();
        tx.commit();
        return list;
	}
}
