package spring.pag049;

import spring.pag046.Instrument;

public class Guitar implements Instrument{
	public Guitar() {}

	@Override
	public String play() {
		System.out.println("ring ring ring");
		return "toot toot toot";
	}

	@Override
	public void tune() {
		System.out.println("guitar tune");
	}

	@Override
	public void clean() {
		System.out.println("guitar clean");
	}

}
