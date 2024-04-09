package site.beemil.samantha.dao;


import site.beemil.samantha.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {

	// 로그인 서비스
	public UserVO login(String userId) throws Exception ;

}