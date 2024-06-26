package com.vwits.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class VwitsController 
{
@RequestMapping("/")
public String hello() 
{
	String userName = System.getProperty("user.name");
	String Password=System.getenv("user.password");
	System.out.println("Window's Username: "+userName);
	System.out.println("Window's Password: "+Password);
return "Username-"+userName;
}
}
