package com.sujata.producer;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats(){
		System.out.println("Audience are taking their seats!!!");
	}
	
	public void switchOffCellPhones(){
		System.out.println("Audeince are requested to switch off their cell phones");
	}
	
	public void applaud(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	public void demandRefund(){
		System.out.println("BOOOO We need our money back.... :-( ");
	}
	
	public void leave(){
		System.out.println("Audience Leaving Auditorium and going home!!");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try{
			//Before
			takeSeats();
			switchOffCellPhones();
			
			joinpoint.proceed();
			
			//After-returning
			applaud();
		}
		catch (Throwable e) {
			//After-throwing
			demandRefund();
		}
		finally {
			//After
			leave();
		}
	}
}
