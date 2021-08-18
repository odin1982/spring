package spring.pag041;

public class Piano implements Instrument{
	public Piano() {}

	@Override
	public void play() {
		System.out.println("Plink plink plink");
	}

}
