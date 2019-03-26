package com.shdosh.client.example;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;
import com.shdosh.api.example.IHelloService;

/**
 * 客户端
 * @author dell
 *
 */
public class Client {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
		context.start();
		IHelloService helloService = (IHelloService)context.getBean("helloService");//获取远程服务代理
		String hello = helloService.sayHello("hello world");//执行远程方法
		System.out.println(hello);
	}
}
