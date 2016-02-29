package youtubeBis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Video extends Interactionnable implements Serializable{
		
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Categorie categorie;
	
	private String url;
	
	@ManyToOne
	private Chaine chaine;
	
	
	@ManyToMany
	private List<Playlist> playlist;
	
	
	public Video(){}
	
	public Video(String n, Categorie cat, String u) {
		name = n;
		categorie = cat;
		url=u;
		this.playlist = new ArrayList<Playlist>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void like() {
		interactions.add(new Like());
	}
}
