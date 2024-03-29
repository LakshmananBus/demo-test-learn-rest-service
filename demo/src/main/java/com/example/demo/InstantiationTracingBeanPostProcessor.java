package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {
	// simply return the instantiated bean as-is
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("Before Bean '" + beanName + "' created : " + bean.toString());
		return bean; // we could potentially return any object reference here...
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	//	System.out.println("Bean '" + beanName + "' created : " + bean.toString());
		return bean;
	}
}