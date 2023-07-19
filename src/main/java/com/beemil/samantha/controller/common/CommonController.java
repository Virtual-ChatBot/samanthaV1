package com.beemil.samantha.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping("/")
    public String index() {

        System.out.println("::");
        System.out.println("[CommonController] 비밀연구소 오신 걸 환영합니다");

        return "index";
    }

    @RequestMapping("/visit")
    public String visit() {

        System.out.println("::");
        System.out.println("[CommonController] 비밀연구소 오신 걸 환영합니다");

        return "main";
    }
}
