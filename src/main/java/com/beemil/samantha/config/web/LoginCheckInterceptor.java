package com.beemil.samantha.config.web;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Component
public class LoginCheckInterceptor implements HandlerInterceptor {

	///Constructor
	public LoginCheckInterceptor(){
		System.out.println("::"+getClass()+".setLogonCheckInterceptor Call.........");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		if(request.getSession().getAttribute("result") != null) { // 로그인이 되어 있으면

			System.out.println("::");
			System.out.println("[LogonCheckInterceptor] 서비스 실행을 허가합니다");

			return true; 	// 컨트롤러의 요청이 처리된다.

		} else {			// 로그인이 되어 있지 않으면

			System.out.println("::");
			System.out.println("[LogonCheckInterceptor] 서비스 실행을 거부합니다");

			response.setContentType("text/html; charset=UTF-8");

			PrintWriter out = response.getWriter();

			out.println("<script>");
			out.println("alert('비정상적인 접근은 할 수 없습니다');");
			out.println("location.href='/';");
			out.println("</script>");
			out.close();

			return false; // 컨트롤러의 요청이 처리되지 않는다.
		}
	}
}//end of class