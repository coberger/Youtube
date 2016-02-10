package youtubeBis;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String nom;
	
	private List<Video> videos;

	public Playlist(String n) {
		nom = n;
		videos = new ArrayList<Video>(); 
	}

}
