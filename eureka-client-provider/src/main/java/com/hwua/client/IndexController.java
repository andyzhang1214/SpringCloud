package com.hwua.client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class IndexController {
	
	@RequestMapping(value="/getprovider",method = RequestMethod.GET)
	public String getUser(HttpServletRequest request) {
		
		
		System.out.println(request.getRequestURL());
		
		return "hello,i am a provider";
	}
	
}
