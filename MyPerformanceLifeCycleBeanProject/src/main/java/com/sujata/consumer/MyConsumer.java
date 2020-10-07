package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;

public class MyConsumer {

	public static void main(String[] args) {
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		springContainer.registerShutdownHook();
//		Performer p1=(Performer)springContainer.getBean("Avinash");
//		p1.perform();
//		
//		Performer p2=(Performer)springContainer.getBean("Nilay");
//		p2.perform();

		//Beans Created By Spring Container or IOC Container are singleton (Default Behaviour)
		Performer p1=(Performer)springContainer.getBean("myDancer");
		System.out.println(p1.hashCode());

		Performer p2=(Performer)springContainer.getBean("myDancer");
		System.out.println(p2.hashCode());

		
		
	}

}
