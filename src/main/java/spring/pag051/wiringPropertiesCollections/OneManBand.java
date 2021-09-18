package spring.pag051.wiringPropertiesCollections;

import java.util.Properties;
import java.util.Set;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;

public class OneManBand implements Performer{
	private Properties instruments;

	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws PerformanceException {
		Set<String> keys = instruments.stringPropertyNames();
	    for (String key : keys) {
	      System.out.println(key + " : " + instruments.getProperty(key));
	    }
	}

}
