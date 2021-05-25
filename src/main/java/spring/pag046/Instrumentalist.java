package spring.pag046;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;

public class Instrumentalist implements Performer{
	private String song;
	private int age;
	private Instrument instrument;
	
	public Instrumentalist() {}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing : " + song + "with age: " + age);
	}

	public void setSong(String song) {
		this.song = song;
	}
	
	

	public void setAge(int age) {
		this.age = age;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
}
