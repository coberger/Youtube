package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import DAO.MyDAO;
import DAO.VideoDAO;
import youtubeBis.Categorie;
import youtubeBis.Video;

@ManagedBean
@ViewScoped
public class VideoBean implements Serializable{

	private Video videoToAdd;
	
	private Long idCategorie = new Long(0);
	
	private String categorieName = "";
	
	private List<Video> videos;
	private List<Video> tendances = new ArrayList<>();
	
	@PostConstruct
	public void init(){
		VideoDAO dao = new VideoDAO();
		videoToAdd = new Video();
		dao.deleteAll();
		videos = new ArrayList<Video>();
		
        for(Video video : dao.getAllVideo()) {
        	videos.add(video);
        }
    }
    
    public List<Video> getVideoByName(String research){
    	VideoDAO dao = new VideoDAO();
    	List<Video> result = dao.findByName(research);
    	return result;
    }
    
	public List<Video> getVideos() {
        return videos;
    }
	
	public List<Video> getTendances() {
        return tendances;
    }
    
    public void like(String id){
    	
    	// TODO : ajouter le like à la vidéo d'id id...
    	
    }
    
    public void getTendancesVideos(){
    	tendances = new VideoDAO().getAllVideo();
    }
    
    public String add(){
    	VideoDAO dao = new VideoDAO();
		videoToAdd = dao.add(videoToAdd, categorieName);
    	videos.add(videoToAdd);
    	videoToAdd = new Video();
    	return "home";
    }

	public Video getVideoToAdd() {
		return videoToAdd;
	}

	public void setVideoToAdd(Video videoToAdd) {
		this.videoToAdd = videoToAdd;
	}

	/**
	 * @return the idVideoToAdd
	 */
	public Long getIdCategorie() {
		return idCategorie;
	}

	/**
	 * @param idVideoToAdd the idVideoToAdd to set
	 */
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	/**
	 * @return the categorieName
	 */
	public String getCategorieName() {
		return categorieName;
	}

	/**
	 * @param categorieName the categorieName to set
	 */
	public void setCategorieName(String categorieName) {
		this.categorieName = categorieName;
	}
    
}
