package com.example.selenium.demo.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
@EnableWebMvc
public class Helloworldcontroller {
	
	
	@GetMapping("/NIDHI")
	 public Hellow Getstring() {
		Hellow hello=new Hellow();
		hello.setWord1("Nidhima");
		hello.setWord2("Vidima");
		return hello;
	 }

}
