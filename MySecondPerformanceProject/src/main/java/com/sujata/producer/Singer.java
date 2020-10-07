package com.sujata.producer;

import java.util.List;

public class Singer implements Performer {

	private List<String> songs;
	
	public Singer(List<String> songs) {
		super();
		this.songs = songs;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing => ");
		for(String song:songs){
			System.out.println(song);
		}

	}

}
