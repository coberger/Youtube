package youtubeBis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Video {
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
}
