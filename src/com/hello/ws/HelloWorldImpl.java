package com.hello.ws;

import javax.jws.WebService;


@WebService(endpointInterface = "com.hello.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorld(String nome) {
		return "Hello World " + nome;
	}
	
	@Override
	public int getSomma(int a, int b){
		return a+b;
	}
}