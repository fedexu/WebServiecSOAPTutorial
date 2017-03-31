package com.hello.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{
	
	@WebMethod String getHelloWorld(String nome);
	
	@WebMethod int getSomma(int a, int b);
	
}