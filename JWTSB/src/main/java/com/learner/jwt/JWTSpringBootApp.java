/**
 * 
 */
package com.learner.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author DELL
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.learner.jwt")
public class JWTSpringBootApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(JWTSpringBootApp.class, args);
	}

}
