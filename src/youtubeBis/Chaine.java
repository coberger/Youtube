package youtubeBis;

import java.util.ArrayList;
import java.util.List;

public class Chaine {
	
	private String nom;
	private List<Video> videos;
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
	
}
