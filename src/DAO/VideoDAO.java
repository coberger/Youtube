package DAO;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
}
