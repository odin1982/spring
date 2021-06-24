package spring.pag046;

public class Piano implements Instrument{

	@Override
	public String play() {
		return "plink plink plink";
	}

	@Override
	public void tune() {
		System.out.println("tune piano");
		
	}

	@Override
	public void clean() {
		System.out.println("clean piano");
	}

}
