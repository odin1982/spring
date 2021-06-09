package spring.pag049;

import spring.pag046.Instrument;

public class Saxophone implements Instrument{
	public Saxophone() {}

	@Override
	public String play() {
		System.out.println("toot toot toot");
		return "toot toot toot";
	}

}
