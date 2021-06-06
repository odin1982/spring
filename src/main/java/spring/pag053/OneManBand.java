package spring.pag053;

import java.util.Collection;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;
import spring.pag046.Instrument;

public class OneManBand implements Performer {

	public OneManBand() {}

	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments) {
			System.out.println(instrument.play());
		}
	}

	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

}
