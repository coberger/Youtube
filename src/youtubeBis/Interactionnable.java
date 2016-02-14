package youtubeBis;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public interface Interactionnable {
	@Id
	@GeneratedValue
	public Long id = 0;
	
	@OneToMany
	public List<Interaction> interactions = new ArrayList<Interaction>();
}
