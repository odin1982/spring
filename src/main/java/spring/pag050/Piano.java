package spring.pag050;

import spring.pag046.Instrument;

public class Piano implements Instrument{

	@Override
	public String play() {
		return "plink plink plink";
	}

}
