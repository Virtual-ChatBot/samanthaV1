package site.beemil.samantha.service.user;


import site.beemil.samantha.dao.UserDAO;
import site.beemil.samantha.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//==> 회원관리 서비스 구현
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