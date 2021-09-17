package spring.pag048.wiringCollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import spring.pag031.PerformanceException;
import spring.pag031.Performer;
import spring.pag041.Instrument;

public class OneManBand  implements Performer{
	private Collection<Instrument> instruments;
	private List<Instrument> instrumentsList;
	private Instrument[] instrumentsArray;
	
	public OneManBand() {}
	
	//Injecting by setter
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	//Injecting by setter
	public void setInstrumentsList(List<Instrument> instrumentsList) {
		this.instrumentsList = instrumentsList;
	}
	//Injecting by setter
	public void setInstrumentsArray(Instrument[] instrumentsArray) {
		this.instrumentsArray = instrumentsArray;
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Instruments with collection:");
		instruments.forEach(i-> i.play());
		
		System.out.println();
		System.out.println("Instruments with list:");
		instrumentsList.forEach(i-> i.play());
		
		System.out.println();
		System.out.println("Instruments with array:");
		for(int i=0; i<instrumentsArray.length; i++) {
			instrumentsArray[i].play();
		}
	}

}
