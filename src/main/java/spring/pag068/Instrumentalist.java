package spring.pag068;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;
import spring.pag046.Instrument;

public class Instrumentalist implements Performer{
	private String song;
	private int age;
	private Instrument instrument;
	
	public Instrumentalist() {}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing : " + song + " with age: " + age + " and the sound is: " +instrument.play());
	}

	
	public void tuneInstrument() {
		instrument.tune();
	}
	
	public void cleanInstrument() {
		instrument.clean();
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
