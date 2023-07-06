package com.beemil.samantha.config.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Autowired
	private LoginCheckInterceptor loginCheckInterceptor;
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginCheckInterceptor)
                .addPathPatterns("/**") // 모든 requestURL에 대해 진입 거부
                .excludePathPatterns(	// 제외 대상
                		  "/"
                        , "/css/**"
                        , "/fonts/**"
                        , "/images/**"
						, "/media/**"
                        , "/js/**"
						, "/bot/stt/**"
						, "/bot/chat/**"
						, "/bot/tts/**"
						, "/bot/navi/**"
						, "/user/json/loginCk/**"
						, "/user/logout/**");
    }
}
