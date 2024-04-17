package site.beemil.samanthaV1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.beemil.samanthaV1.dao.UserDAO;
import site.beemil.samanthaV1.service.UserService;
import site.beemil.samanthaV1.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

    ///Field
    private final UserDAO userDao;

    ///Constructor
    @Autowired
    public UserServiceImpl(UserDAO userDao) {
        System.out.println("::"+getClass()+".setUserRepository Call.........");
        this.userDao = userDao;
    }

    public UserVO login(String userId) throws Exception {
        return userDao.login(userId);
    }
}
