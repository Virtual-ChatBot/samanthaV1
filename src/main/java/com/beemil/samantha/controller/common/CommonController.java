package com.beemil.samantha.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping("/")
    public String index() {

        System.out.println("::");
        System.out.println("[CommonController] 비밀연구소에 오신 걸 환영합니다.");

        return "index";
    }

    @RequestMapping("/intro")
    public String intro() {

        System.out.println("::");
        System.out.println("[CommonController] 소개 서비스를 실행합니다.");

        return "intro";
    }
}
