package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SomeSinger")
public class Singer implements Performer {

	@Value("LALALAL")
	private String song;
	
	public Singer(){
		
	}
	public Singer(String song) {
		super();
		this.song = song;
	}


	@Override
	public void perform() {
		System.out.println("Singer is singing "+song);

	}

}
