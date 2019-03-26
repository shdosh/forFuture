package com.shdosh.server.starter;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ·þÎñÆô¶¯Æ÷
 * @author dell
 *
 */
public class Server {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
		
		context.start();
		System.in.read();
	}
}
