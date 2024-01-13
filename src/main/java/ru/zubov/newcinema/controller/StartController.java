package ru.zubov.newcinema.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.zubov.newcinema.model.User;

@Controller
public class StartController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal User user) {
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
}
