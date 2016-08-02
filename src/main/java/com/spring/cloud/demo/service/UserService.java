package com.spring.cloud.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.cloud.demo.pojo.User;

@Service
public class UserService {
	
	
	public List<User> searchAll() {


        List<User> ls = new ArrayList<User>();

        User user = new User();

        user.setName("test 远程 serveice");

        ls.add(user);

        return ls;

}
	
	
//	public List<String> searchAll() {
//        List<String> ls = new ArrayList<String>();
//        ls.add("test 远程 serveice");
//        ls.add("test 远程 serveice123");
//        return ls;
//	}
}
