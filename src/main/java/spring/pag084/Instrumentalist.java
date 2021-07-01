package spring.pag084;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;
import spring.pag046.Instrument;

public abstract class Instrumentalist implements Performer{
	public Instrumentalist() {}
	
	public void perform() throws PerformanceException{
		System.out.println("Playing " + song + " : ");
		getInstrument().play();
	}
	
	private String song;

	public void setSong(String song) {
		this.song = song;
	}
	
	public abstract Instrument getInstrument();
}
