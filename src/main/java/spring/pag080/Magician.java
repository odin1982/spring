package spring.pag080;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;

public class Magician implements Performer{
	private String magicWords;
	private MagicBox magicBox;
	
	public Magician() {}
	
	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}
	
	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println(magicWords);
		System.out.println("The magic box contains..");
		System.out.println(magicBox.getContents());
	}

}
