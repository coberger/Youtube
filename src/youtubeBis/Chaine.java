package youtubeBis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

@Entity
public class Chaine implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	
	private String nom;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "chaine")
	private List<Video> videos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "chaine")
	private List<Playlist> playlists;
	
	@ManyToOne
	private Compte compte;
	
	public Chaine(){}
	
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
	
	@PostLoad
	@PostPersist
	@PostUpdate
	public Video ajouterVideo(String name, String categorie, String url) {
		Video video = new Video(name, new Categorie(categorie), url);
		videos.add(video);
		return video;
		
	}
	
//	@PostLoad
//	@PostPersist
//	@PostUpdate
//	public Playlist ajouterPlaylist(String name) {
//		Playlist playlist = new Playlist(name);
//		playlists.add(playlist);
//		return playlist;
//		
//	}
	
}
