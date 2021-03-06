package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;

public class MyConsumer {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perform.xml");
		
		Performer p1=(Performer)springContainer.getBean("Avinash");
		
		p1.perform();
		
		Performer p2=(Performer)springContainer.getBean("Keshav");
//		((Juggler)p2).setBalls(5);
		p2.perform();

	}

}
