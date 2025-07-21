package com.nt;

import org.springframework.boot.SpringApplication;    
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=SpringApplication.run(JpaApplicationMain.class, args);

	}

}
