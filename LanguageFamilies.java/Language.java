
public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
	
	
	public Language(String named, int speakers, String whereSpoken, String orderOfWords) {
		name = named;
		numSpeakers = speakers;
		regionsSpoken = whereSpoken;
		wordOrder = orderOfWords;
	}
	
	public void getInfo() {
		System.out.println(name+" is spoken by "+numSpeakers+" people mainly in "+regionsSpoken+". The language follows the word order: "+wordOrder);
	}
	
	public static void main(String[] args) {
		
		Language english = new Language("English", 70000000, "North America", "Verbs first");
		english.getInfo();
		Mayan chontai = new Mayan("Chontai",36810);
		chontai.getInfo();
		SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese",920000000);
		mandarin.getInfo();
		SinoTibetan sinitic = new SinoTibetan("Sinitic",100000000);
		sinitic.getInfo();
	}

}
