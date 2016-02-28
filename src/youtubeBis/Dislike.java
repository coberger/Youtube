package youtubeBis;

import javax.persistence.Entity;

@Entity
public class Dislike extends Interaction{
	public Dislike() {
		super("Dislike");
	}
}
