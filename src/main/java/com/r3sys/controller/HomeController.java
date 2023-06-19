package com.r3sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

@RequestMapping("/")
public String home()
{
System.out.println("This is home url..");
return "login";
}
@RequestMapping("/about")
public String about()
{
System.out.println("This is about controller..");
return "about";
} 
@RequestMapping("/login")
public String login(){
	return "login";
}
@RequestMapping("/Afterlogin")
public String Afterlogin(HttpServletRequest request){
	String email=request.getParameter("email");
	String pwd=request.getParameter("pwd");
	if(email.equals("chetan@gmail.com")&&pwd.equals("me")){
		return "dashboard";
	}else
	{
		return "login";
	}
	
}
@RequestMapping("/AddProcess")
public String AddProcess(){
	return "addprocess";
}
public String AddIssue(){
	return "addissue";
}
}



