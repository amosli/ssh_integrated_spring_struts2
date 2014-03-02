package com.amos.web;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.amos.service.IHello;
import com.opensymphony.xwork2.ActionContext;

/** 
* @ClassName: HelloActionSpring 
* @Description: 这种方式没有完全实现struts和spring的集成
* @author: amosli
* @email:amosli@infomorrow.com
* @date Mar 3, 2014 1:28:28 AM  
*/
public class HelloActionSpring {
	private IHello hello;
	public String hellomethod(){
		ApplicationContext applicationContext  = WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
		hello= applicationContext.getBean(IHello.class);
		String sayHi = hello.sayHi();
		ActionContext.getContext().put("msg", sayHi);
		return "SUCCESS";
	}
}
