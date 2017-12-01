package cn.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.demo.entity.User;

@Mapper
public interface UserMapper {
	List<User> findByList();
}
