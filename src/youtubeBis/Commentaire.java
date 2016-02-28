package youtubeBis;

import javax.persistence.Entity;

@Entity
public class Commentaire extends Interaction {
	
	private String value;
	
	public Commentaire(String v) {
		super("Comment");
		value = v;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
