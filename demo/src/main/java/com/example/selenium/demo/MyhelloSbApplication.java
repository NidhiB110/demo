package com.example.selenium.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.selenium.demo.controler.Hellow;

@SpringBootApplication
public class MyhelloSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyhelloSbApplication.class, args);
		
		String s="Nidddhi";
		StringBuffer sb=new StrinBuffer(s);
		sb.reverse();
		System.out.println("string reverse" +sb);
	}

}
