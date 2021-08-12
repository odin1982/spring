package spring.pag033;

import spring.pag031.PerformanceException;

public class PoeticJuggler extends Juggler{
	private Poem poem;

	public PoeticJuggler(Poem poem) {
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While reciting ...");
		poem.recite();
	}
}
