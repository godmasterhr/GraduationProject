package com.e_mall.www.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Test {
	
	@Scheduled(fixedDelay=10000)
	public void say(){
		System.out.println();
		int i =1/0;
		System.out.println("!!!!!!!!!!");
	}
}
