package com.beemil.samantha.controller.user;

import com.beemil.samantha.domain.User;
import com.beemil.samantha.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user/*")
public class UserController {

	///Field
	private UserService userService;

	///Constructor
	@Autowired
	public UserController(UserService userService){
		System.out.println("::"+getClass()+".setUserService Call.........");
		this.userService = userService;
	}

	// 로그인 서비스
	@RequestMapping("login")
	public String login(@RequestParam("userId") String userId, HttpServletRequest request ) throws Exception{

		System.out.println("::");
		System.out.println("[UserController] 로그인 서비스를 실행합니다. 환영합니다.");

		//1) 세션을 활용하여
		HttpSession session = request.getSession();

		//2) 로그인한 회원 정보를 main.jsp 로 전달
		User user = userService.login(userId);

		session.setAttribute("user", user);

		return "main";
	}

	//로그아웃 서비스
	@RequestMapping("logout")
	public String logout(HttpServletRequest request ) throws Exception{

		System.out.println("::");
		System.out.println("[UserController] 로그아웃 서비스를 실행합니다. 다음에 뵙겠습니다.");

		// 로그아웃 처리 세션 초기화.
		request.getSession().invalidate();

		// 로그인 유지 풀기 기능 준비 중..
		//Cookie cookie = new Cookie("keepLogin", ""); // keepLogin이라는 값을 빈 문자열로 만듦
		//cookie.setMaxAge(0); // 쿠키 유지 시간이 0이면 삭제를 의미함
		//cookie.setPath(request.getContextPath());
		//response.addCookie(cookie); // 응답에 쿠키정보를 담음

		return "index";
	}

	//회원가입 시작 서비스
	//@RequestMapping("addUser")
	//public String addUser() throws Exception{
	//
	//	System.out.println("::");
	//	System.out.println("[UserController] 회원가입 서비스를 실행합니다.");

	//	return "redirect:/user/addUserView.jsp";
	//}
}