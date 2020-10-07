package com.sujata.consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;

public class MyClient {

	public static void main(String[] args) {
//		Greet greet=new GoodMorning();

//		Resource resource=new ClassPathResource("greet.xml");
//		BeanFactory springContainer=new XmlBeanFactory(resource);
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("com/sujata/consumer/greet.xml");
//		ApplicationContext springContainer=new FileSystemXmlApplicationContext("D:\SynechronOct2020SpringCoreAndMVC\WorkSpace\SpringCore\MyFirstSpringProject\src\main\java\com\sujata\consumer\greet.xml");
				
		Greet greet=(Greet)springContainer.getBean("ge");
		greet.wish("Sujata");
	}

}
