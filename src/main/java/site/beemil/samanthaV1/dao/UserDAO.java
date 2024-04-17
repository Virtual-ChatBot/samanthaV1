package site.beemil.samanthaV1.dao;


import site.beemil.samanthaV1.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {

	// 로그인 서비스
	public UserVO login(String userId) throws Exception ;

}