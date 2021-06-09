package spring.pag055;

import java.util.Collection;
import java.util.Map;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;
import spring.pag046.Instrument;

public class OneManBand implements Performer {

	public OneManBand() {}

	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print(key + ":");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
		
	}

	private Map<String,Instrument> instruments;

	public void setInstruments(Map<String,Instrument> instruments) {
		this.instruments = instruments;
	}

}
