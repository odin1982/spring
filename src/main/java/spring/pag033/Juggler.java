package spring.pag033;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;

public class Juggler implements Performer{
	private int beanBags = 3;

	public Juggler() {}
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println( "Juggling " + beanBags + " beanbags");
	}

}
