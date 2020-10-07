package com.sujata.producer;

import java.util.Set;

public class Instrumentalist implements Performer {

	private Set<Instrument> instruments;
	
	
	public Instrumentalist(Set<Instrument> instruments) {
		super();
		this.instruments = instruments;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing : ");
		for(Instrument instrument:instruments){
			instrument.play();
		}

	}

}
