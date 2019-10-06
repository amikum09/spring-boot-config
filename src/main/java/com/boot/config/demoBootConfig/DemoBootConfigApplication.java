package com.boot.config.demoBootConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer

public class DemoBootConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBootConfigApplication.class, args);
	}
	
	/*@RestController
	class Hello{
		@RequestMapping("/")
		String myMethod() {
			return "Hello World";
		}*/

}
