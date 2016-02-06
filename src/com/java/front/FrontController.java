package com.java.front;

public class FrontController {

	Dispatcher dispatcher;
	
	public void dispathrequest(String requestPage){
		dispatcher=new Dispatcher();
		dispatcher.visitPage(requestPage);
	}
}