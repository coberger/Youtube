package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import DAO.MyDAO;
import DAO.VideoDAO;
import youtubeBis.Categorie;
import youtubeBis.Video;

@ManagedBean
@SessionScoped
public class VideoBean implements Serializable{

	private List<Video> videos;
	
	@PostConstruct
	public void init(){
		VideoDAO dao = new VideoDAO();
		dao.deleteAll();
		videos = new ArrayList<Video>();
        Video v = new Video("Adele - Hello", new Categorie("Musique"), 
        		"https://www.youtube.com/v/rYEDA3JcQqw");
        dao.add(v);
        Video v2 = new Video("Wazoo - Montferrand", new Categorie("Musique"), 
        		"https://www.youtube.com/v/OPVrR9y-xZs");
        dao.add(v2);
        
        for(Video video : dao.getAllVideo()) {
        	videos.add(video);
        }        
    }
	
    public List<Video> getVideos() {
        return videos;
    }
    
    public void like(){
    	
    }
}
