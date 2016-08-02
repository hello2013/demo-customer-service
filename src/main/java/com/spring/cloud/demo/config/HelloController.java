package com.spring.cloud.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.cloud.demo.pojo.User;
import com.spring.cloud.demo.service.UserService;

@Controller
public class HelloController {
	@Autowired
	 DataProperties dataProperties;
	
	   @ResponseBody
	    @RequestMapping(value = "/hello")
	public String getMessage() {
		  
		   String message = dataProperties.getMessage();
		System.err.println("-----------my.message="+message);
		return message;
	}
	   @Autowired
	   UserService userService;
	   @ResponseBody
	   @RequestMapping(value="/users",method=RequestMethod.GET)
		public List<User> readUsersInfo(){
			List<User> ls=userService.searchAll();		
			return ls;
		}
	   
	   @ResponseBody
	   @RequestMapping(value="/user",method=RequestMethod.GET)
		public User readUserInfo(){
			User user = new User();
			user.setId("1");
			user.setName("远程用户对象");
			return user;
		}
}
