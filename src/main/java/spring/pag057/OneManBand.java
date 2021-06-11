package spring.pag057;

import java.util.Iterator;
import java.util.Properties;

import spring.pag040.PerformanceException;
import spring.pag040.Performer;

public class OneManBand implements Performer{
	private Properties instruments;
	public OneManBand() {}

	@Override
	public void perform() throws PerformanceException {
		for(Iterator iter = instruments.keySet().iterator();iter.hasNext();) {
			String key = (String)iter.next();
			System.out.println(key +" : " + instruments.getProperty(key) );
			
		}
	}

	public Properties getInstruments() {
		return instruments;
	}

	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}
	
	
}
