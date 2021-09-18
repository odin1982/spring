package spring.pag049.wiringMapCollections;

import java.util.Map;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;
import spring.pag041.Instrument;

public class OneManBand implements Performer{
	private Map<String,Instrument> instruments;

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws PerformanceException {
		for(String key : instruments.keySet()) {
			System.out.println(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

}
