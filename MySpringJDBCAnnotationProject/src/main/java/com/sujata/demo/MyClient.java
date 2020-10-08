package com.sujata.demo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.presentation.ItemUI;

public class MyClient 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	
        ApplicationContext iocContainer= new ClassPathXmlApplicationContext("itemjdbc.xml");
        
        ItemUI itemUi=(ItemUI)iocContainer.getBean("itemUi");
        
        while(true){
        	itemUi.showMenu();
        	System.out.println("Enter choice ");
        	int choice=sc.nextInt();
        	itemUi.perform(choice);
        }
    }
}
