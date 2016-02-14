package youtubeBis;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Chaine {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nom;
	@OneToMany
	private List<Video> videos;
	@OneToMany
	private List<Playlist> playlists;
	
	public Chaine(String nom) {
		this.nom = nom;
		this.videos = new ArrayList<Video>();
		this.playlists = new ArrayList<Playlist>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public List<Playlist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}

	public Video ajouterVideo(String name, String categorie, String url) {
		Video video = new Video(name, new Categorie(categorie), url);
		videos.add(video);
		return video;
		
	}
	
}
