package com.sujata.producer;

import org.springframework.stereotype.Component;

//MyDancerDemo : default id myDancerDemo
@Component("Sonu")
public class Dancer implements Performer {

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in Free Style!!!");

	}

}
