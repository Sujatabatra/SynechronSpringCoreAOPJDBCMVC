package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;

public class MyConsumer {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformaceConfiguration.class);
		
		Performer p1=(Performer)springContainer.getBean("Anil");
		p1.perform();
		
		Performer p2=(Performer)springContainer.getBean("SomeSinger");
		p2.perform();
		

	}

}
