package com.shdosh.client.example;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;
import com.shdosh.api.example.IHelloService;

/**
 * �ͻ���
 * @author dell
 *
 */
public class Client {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
		context.start();
		IHelloService helloService = (IHelloService)context.getBean("helloService");//��ȡԶ�̷������
		String hello = helloService.sayHello("hello world");//ִ��Զ�̷���
		System.out.println(hello);
	}
}
