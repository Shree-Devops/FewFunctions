package com;

public class HomePage extends BasePage{
	
	public HomePage () {
        System.out.println("Login Page Created.");
    }
    public HomePage(String pageLink) {
        setPageLink(pageLink);
    }

}
