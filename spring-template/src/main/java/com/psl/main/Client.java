package com.psl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.HelloWorld;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"META-INF/spring/spring-beans-context.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		
		obj.printHello();
		
		((ConfigurableApplicationContext)context).close();

	}

}
