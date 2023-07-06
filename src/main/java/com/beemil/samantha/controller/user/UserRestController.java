package com.beemil.samantha.controller.user;

import com.beemil.samantha.domain.User;
import com.beemil.samantha.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user/*")
public class UserRestController {

	///Field
	private UserService userService;

	///Constructor
	@Autowired
	public UserRestController(UserService userService){
		System.out.println("::"+getClass()+".setUserService Call.........");
		this.userService = userService;
	}

	//계정 유무 확인 서비스
	@RequestMapping("json/loginCk")
	public String loginCk(String userId, String password, HttpServletRequest request) throws Exception {

		System.out.println("::");
		System.out.println("[UserRestController] 계정 유무 확인을 시작합니다.");

		String result="";

		User user = userService.login(userId);

		if(user == null ) {

			result="NOID";

			System.out.println("::");
			System.out.println("[UserRestController] 아이디가 없습니다. 접속을 거부합니다.");

		} else if(user != null ) {

			result="YESID";

			System.out.println("::");
			System.out.println("[UserRestController] 아이디 확인이 완료되었습니다. 패스워드 확인을 시작합니다.");

			//해시코드 암호화 기능 준비중 if(Encoder.matches(pwd, vo.getPassword()))
			if(user.getPassword().equals(password)){

				result="YESPWD";

				//1) 세션 생성하기
				HttpSession session = request.getSession();

				//2) 세션 유지시간 설정
				session.setMaxInactiveInterval(600); // 1800 = 60s*10 (10분)

				//3) LogonCheckInterceptor에 세션을 전달하여 외부 유입 차단.
				session.setAttribute("result", result);

				System.out.println("::");
				System.out.println("[UserRestController] 패스워드 확인이 완료되었습니다. 접속을 허가합니다.");

			} else {

				result="NOPWD";

				System.out.println("::");
				System.out.println("[UserRestController] 패스워드가 틀렸습니다. 접속을 거부합니다.");
			}
		}
		return result;
	}
}