package cn.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.demo.entity.User;
import cn.demo.mapper.UserMapper;
import cn.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> findByList() {
		return userMapper.findByList();
	}

}
