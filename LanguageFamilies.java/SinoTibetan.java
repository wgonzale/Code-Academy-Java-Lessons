public class SinoTibetan extends Language{

public SinoTibetan(String named, int speakers) {
	super(named,speakers,"Asia","subject-object-verb");
	if(named.toLowerCase().contains("chinese")) {
		this.wordOrder = "subject-verb-object";
	}
}

}
