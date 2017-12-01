package cn.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.entity.User;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String helloTest() {
		return "helloWorld!";
	}
	
	@RequestMapping("/pojo")
	public User getUser() {
		User user = new User();
		user.setName("张三");
		user.setGender("男");
		return user;
	}
}
