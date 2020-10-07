package com.sujata.producer;

import java.util.Map;
import java.util.Set;

public class Juggler implements Performer {

	private Map<String,Integer> thingsCount;
	
	

	public Juggler(Map<String, Integer> thingsCount) {
		super();
		this.thingsCount = thingsCount;
	}



	@Override
	public void perform() {
		Set<String> things=thingsCount.keySet();
		for(String thing:things){
			System.out.println("Juggler is juggling "+thingsCount.get(thing)+" "+thing);
		}

	}

}
