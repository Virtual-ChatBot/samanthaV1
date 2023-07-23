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
	private final UserService userService;

	///Constructor
	@Autowired
	public UserController(UserService userService){

		this.userService = userService;
		System.out.println("::"+getClass()+".setUserService Call.........");
	}

	// 관리자 로그인 서비스
	@RequestMapping("login")
	public String login(@RequestParam("userId") String userId, HttpServletRequest request ) throws Exception{

		System.out.println("::");
		System.out.println("[UserController] 관리자 로그인 서비스를 실행합니다.");

		//1) 세션을 활용하여
		HttpSession session = request.getSession();

		//2) 로그인한 회원 정보를 main.jsp 로 전달
		User user = userService.login(userId);

		session.setAttribute("user", user);

		return "main";
	}

	@RequestMapping("/visit")
	public String visit() {

		System.out.println("::");
		System.out.println("[CommonController] 비회원 입장 서비스를 실행합니다.");

		return "main";
	}

	//로그아웃 서비스
	@RequestMapping("logout")
	public String logout(HttpServletRequest request ) throws Exception{

		System.out.println("::");
		System.out.println("[UserController] 로그아웃 서비스를 실행합니다.");

		// 로그아웃 처리 세션 초기화.
		request.getSession().invalidate();

		return "index";
	}
}