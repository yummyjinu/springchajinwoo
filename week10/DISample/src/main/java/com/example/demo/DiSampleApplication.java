package com.example.demo;

import org.springframework.beans.factory
		.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure
		.SpringBootApplication;

import com.example.demo.used.Greet;

/**
 * 스프링 부트 시작 클래스
 */
@SpringBootApplication
public class DiSampleApplication {
	/**
	 * 스프링 부트 시작
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DiSampleApplication.class, args)
				.getBean(DiSampleApplication.class).execute();
	}
	@Autowired
	private  Greet g;

}
