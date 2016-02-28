package youtubeBis;

public class Abonnement extends Interaction {
	
private String value;
	
	public Abonnement(String v) {
		super("Abonnement");
		value = v;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
