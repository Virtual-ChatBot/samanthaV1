package com.beemil.samantha.dao;


import com.beemil.samantha.domain.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao {

	// 로그인 서비스
	public User login(String userId) throws Exception ;

}