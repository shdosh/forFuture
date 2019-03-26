package com.shdosh.server.example;

import com.shdosh.api.example.IHelloService;

public class HelloServiceImpl implements IHelloService{

	public String sayHello(String name) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}

	public Integer getNumber(Integer num) {
		return num;
	}

}
