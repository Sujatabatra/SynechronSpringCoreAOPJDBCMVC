package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;

public class MyConsumer {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		
		
		Performer p2=(Performer)springContainer.getBean("DhanaRaju");

		p2.perform();

//		Performer p1=(Performer)springContainer.getBean("Avinash");
//
//		p1.perform();
	}

}
