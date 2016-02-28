package youtubeBis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Interactionnable implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	protected List<Interaction> interactions = new ArrayList<Interaction>();
	
	public Long getId(){
		return id;
	}
}
