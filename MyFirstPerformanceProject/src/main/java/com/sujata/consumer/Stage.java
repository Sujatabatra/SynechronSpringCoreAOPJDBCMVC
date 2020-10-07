package com.sujata.consumer;

import java.util.List;

import com.sujata.producer.Performer;

public class Stage {

	private List<Performer> performers;

	public Stage(List<Performer> performers) {
		super();
		this.performers = performers;
	}
	
	public void show(){
		for(Performer performer:performers){
			performer.perform();
		}
	}
}
