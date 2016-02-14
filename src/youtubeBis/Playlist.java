package youtubeBis;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Playlist {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	
	@OneToMany
	private List<Video> videos;

	public Playlist(String n) {
		nom = n;
		videos = new ArrayList<Video>(); 
	}

}
