package com.amos.web;

import com.amos.service.IHello;
import com.opensymphony.xwork2.ActionContext;

public class HelloAction {
	private IHello hello;
	public void setHello(IHello hello) {
		this.hello = hello;
	}
	public String hellomethod(){
		String sayHi = hello.sayHi();
		ActionContext.getContext().put("msg", sayHi);
		return "SUCCESS";
	}
}
