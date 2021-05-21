package spring.pag046;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;

public class Instrumentalist implements Performer{
	
	
	public Instrumentalist() {}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing "+ song + " : ");
	}

}
