package com.shdosh.api.example;

/**
 * First example of Dubbo
 * @author dell
 *
 */
public interface IHelloService {
	
	/**
	 * hello����
	 * @param name
	 * @return
	 */
	String sayHello(String name);
	
	Integer getNumber(Integer num);
}
