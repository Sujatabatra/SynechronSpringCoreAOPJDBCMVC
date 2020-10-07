package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singer implements Performer,BeanNameAware,/*BeanFactoryAware,ApplicationContextAware,*/InitializingBean,DisposableBean {

	private String song;
	private String name;

	public Singer(){
		System.out.println("Hi I am singer class default constructor");
	}
	public Singer(String song) {
		super();
		System.out.println("Hi I am Singer class Constructor");
		this.song = song;
	}

	

	public void setSong(String song) {
		System.out.println("Hi I am Singer Class setter method");
		this.song = song;
	}



	@Override
	public void perform() {
		System.out.println(name+" is singing "+song);

	}
	@Override
	public void setBeanName(String name) {
		System.out.println("Hi I am setBeanName method from BeanNameAware Interface used in Singer class");
		this.name=name;
		
	}
//	@Override
//	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//		System.out.println("Hi i am setBeanFactory method from singer and originally belongs to BeanFactoryAware Interface");
//		
//	}
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		System.out.println("Hi I am setApplicationContext method ");
//		
//	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Clearing the throat!");
		
	}
	
	public void fixingMike(){
		System.out.println(name+" is Fixing Mike!!!");
	}
	
	public void checkMike(){
		System.out.println(name+" is Checking Mike!!!");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println(name+" Gargalings Again after windup!");
		
	}

	public void leaveStage(){
		System.out.println(name+" is leaving the Stage!!");
	}
	
	public void disconnectMike(){
		System.out.println(name+" is disconnecting the Mike and leaving the Stage!");
	}
}
