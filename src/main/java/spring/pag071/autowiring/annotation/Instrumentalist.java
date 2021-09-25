package spring.pag071.autowiring.annotation;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;
import spring.pag041.Instrument;

public class Instrumentalist implements Performer{
	private String song;
	private int age;
	private Instrument instrument;
	public Instrumentalist() {}

	@Override
	public void perform() throws PerformanceException {
		System.out.print("Age: " + age +" ");
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}

	public String getSong() {
		return song;
	}
	
	public String screamSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
	//Injecting by setter
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
