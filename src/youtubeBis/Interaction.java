package youtubeBis;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Interaction implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String type;

	public Interaction(){}
	
	public Interaction(String type) {
		this.type = type;
	}
}
