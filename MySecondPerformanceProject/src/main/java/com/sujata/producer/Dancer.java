package com.sujata.producer;

import java.util.Map;
import java.util.Set;

public class Dancer implements Performer {

	private Map<String, String> songsStyle;
	

	public void setSongsStyle(Map<String, String> songsStyle) {
		this.songsStyle = songsStyle;
	}


	@Override
	public void perform() {
		Set<String> songs=songsStyle.keySet();
		for(String song:songs){
			System.out.println("Dancer is dancing in "+songsStyle.get(song)+" Style on song "+song);
		}

	}

}
