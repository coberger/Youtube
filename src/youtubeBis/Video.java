package youtubeBis;

public class Video {

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
