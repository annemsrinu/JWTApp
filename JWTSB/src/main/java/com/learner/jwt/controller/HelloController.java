/**
 * 
 */
package com.learner.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DELL
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {

		return "Hello JWT!";
	}

	@RequestMapping("/JWT")
	public String sayJWT() {

		return "Hi You are authorized user!";
	}
}
