package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrument;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Performer;

@Configuration
@ComponentScan(basePackages="com.sujata.producer")
public class PerformaceConfiguration {

	@Bean(name="Anil")
	public Performer getDancer(){
		return new Dancer();
	}
	
	@Bean
	public Instrument guitar(){
		return new Guitar();
	}
	
	@Bean("Shyam")
	public Instrumentalist getInstrumentalist(){
		return new Instrumentalist(guitar());
	}
	
	
}
