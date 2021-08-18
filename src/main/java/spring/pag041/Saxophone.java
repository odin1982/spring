package spring.pag041;

public class Saxophone implements Instrument{
	public Saxophone() {}
	
	@Override
	public void play() {
		System.out.println("Toot toot toot");
	}

}
