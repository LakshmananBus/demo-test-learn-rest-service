package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppReady implements InitializingBean{



	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("--------afterPropertiesSet");

	}
	
	

}
