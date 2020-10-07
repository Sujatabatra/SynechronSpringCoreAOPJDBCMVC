package com.sujata.producer;

public class Juggler implements Performer {

	private int balls;
	
	
	public Juggler(){
		System.out.println("Hi i am Juggler default constructor");
	}
	public void setBalls(int balls) {
		this.balls = balls;
		System.out.println("Hi i am Juggler Setter method");
	}


	@Override
	public void perform() {
		System.out.println("Juggler is Juggling "+balls+" balls");

	}

	public void fixingMike(){
		System.out.println("Juggler is Fixing Mike!!!");
	}
}
