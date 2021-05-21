package spring.pag043;

import spring.pag040.Juggler;
import spring.pag040.PerformanceException;

public class PoeticJuggler extends Juggler{
	private Poem poem;
	
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags,Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() throws PerformanceException{
		super.perform();
		System.out.println("WHILE RECITING...");
		poem.recite();
	}
}
