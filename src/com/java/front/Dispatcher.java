package com.java.front;

public class Dispatcher {
	View view;
	public void visitPage(String viewType){
		if(viewType.equalsIgnoreCase("Home")){
			view=new HomeView();
			view.showView();
		}
		else if(viewType.equalsIgnoreCase("SignUp")){
			view=new SignUpView();
			view.showView();
		}
		else
			System.out.println("Error 404:Page Not Found");
	}
}