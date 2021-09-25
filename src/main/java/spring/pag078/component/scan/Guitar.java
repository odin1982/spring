package spring.pag078.component.scan;

import org.springframework.stereotype.Component;

import spring.pag041.Instrument;

@Component
public class Guitar implements Instrument{

	@Override
	public void play() {
		System.out.println("Tocando guitarra!!");
	}

}
