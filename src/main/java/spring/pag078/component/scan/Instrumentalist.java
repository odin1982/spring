package spring.pag078.component.scan;

import org.springframework.stereotype.Component;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;

@Component("eddie")
public class Instrumentalist implements Performer{

	@Override
	public void perform() throws PerformanceException {
		
	}

}
