package com.bit.spring04.springJava2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App2 {

	public static void main(String[] args) {
		// Spring
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beans = new XmlBeanFactory(resource);
		FrontModule module = (FrontModule) beans.getBean("front");
		module.started();
	}
}
