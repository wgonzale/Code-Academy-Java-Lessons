
public class Mayan extends Language {


public Mayan(String named, int speakers) {
	super(named,speakers,"Central America", "verb-object-subject");
}

@Override
public void getInfo() {
	
	System.out.println(this.name+" is spoken by "+this.numSpeakers+ " people mainly in "+this.regionsSpoken+" the language follows the word order: "+this.wordOrder);
	System.out.println("Fun fact: Ki'che is an ergative language");
}



}
