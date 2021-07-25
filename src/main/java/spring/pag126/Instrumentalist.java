package spring.pag126;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;
import spring.pag046.Instrument;
import spring.pag125.Audience;

public class Instrumentalist implements Performer {
	private String song;
	private Instrument instrument;
	private Audience audience;

	public Instrumentalist() {
	}

	@Override
	public void perform() throws PerformanceException {
		audience.takeSeats();
		audience.turnOffCellPhones();
		try {
			System.out.print("Playing " + song + " : ");
			instrument.play();
			audience.applaud();
		} catch (Throwable e) {
			audience.demandRefund();
		}

	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void setAudience(Audience audience) {
		this.audience = audience;
	}
}
