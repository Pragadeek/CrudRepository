package com.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.main.controller.DemoController;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MainApp.class, args);

		// DemoController dm= context.getBean(DemoController.class);
		DemoController dm = (DemoController) context.getBean("win"); // by using bean name

		// DemoController dm= (DemoController) context.getBean("demoController"); //by
		// using class name as bean

		System.out.println(dm.getmessage());

		/*
		 * DemoController ctlr= new DemoController();
		 * System.out.println(ctlr.getmessage());
		 */
		
		
		System.out.println("Pragadee");

	}

}
