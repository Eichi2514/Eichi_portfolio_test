package com.koreait.eichi_portfolio_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String showMain() {
        return "redirect:/";  // /로 리다이렉트하여 static/index.html을 반환
    }
}