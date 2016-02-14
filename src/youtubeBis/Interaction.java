package youtubeBis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Interaction {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String type;

	public Interaction(String type) {
		this.type = type;
	}
}
