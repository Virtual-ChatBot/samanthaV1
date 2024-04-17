package site.beemil.samanthaV1.service;


import site.beemil.samanthaV1.dao.UserDAO;
import site.beemil.samanthaV1.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	///Field
	private final UserDAO userDao;

	///Constructor
	@Autowired
	public UserService(UserDAO userDao) {
		System.out.println("::"+getClass()+".setUserRepository Call.........");
		this.userDao = userDao;
	}

	public UserVO login(String userId) throws Exception {
		return userDao.login(userId);
	}

}