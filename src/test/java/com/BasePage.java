package com;

public class BasePage {

	private String pageLink;
    public BasePage() {
        System.out.println("Base Page Created.");
    }
    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }
}
