package com.beemil.samantha.service.user;

import com.beemil.samantha.dao.UserDao;
import com.beemil.samantha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//==> 회원관리 서비스 구현
@Service
public class UserService {

	///Field
	private UserDao userDao;

	///Constructor
	@Autowired
	public UserService(UserDao userDao) {
		System.out.println("::"+getClass()+".setUserRepository Call.........");
		this.userDao = userDao;
	}

	public User login(String userId) throws Exception {
		return userDao.login(userId);
	}

}