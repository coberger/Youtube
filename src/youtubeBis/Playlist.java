package youtubeBis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

@Entity
public class Playlist implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	
	@ManyToOne
	private Chaine chaine;
	
	@ManyToMany
	private List<Video> videos;

	public Playlist(){}
	
	public Playlist(String n) {
		nom = n;
		videos = new ArrayList<Video>(); 
	}
	
	@PostLoad
	@PostPersist
	@PostUpdate
	public Video ajouterVideo(Video video) {
		videos.add(video);
		return video;
		
	}

}
