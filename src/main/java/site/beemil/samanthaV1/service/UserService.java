package site.beemil.samanthaV1.service;

import site.beemil.samanthaV1.vo.UserVO;

public interface UserService {

	UserVO login(String userId) throws Exception;

}