package youtubeBis;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Video extends Interactionnable {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private Categorie categorie;
	private String url;
	
	public Video(String n, Categorie cat, String u) {
		name = n;
		categorie = cat;
		url=u;
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
