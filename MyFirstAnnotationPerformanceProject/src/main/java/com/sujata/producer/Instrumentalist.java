package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Avinash")
public class Instrumentalist implements Performer {

	//ByType
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	
	public Instrumentalist(){
		
	}
	public Instrumentalist(Instrument instrument) {
		super();
		this.instrument = instrument;
	}


	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing : ");
		instrument.play();

	}

}
