package spring.pag050;

import spring.pag046.Instrument;

public class Piano implements Instrument{

	@Override
	public String play() {
		System.out.println("plink plink plink");
		return "plink plink plink";
	}

	@Override
	public void tune() {
		System.out.println("piano tune");
	}

	@Override
	public void clean() {
		System.out.println("piano clean");
	}

}
