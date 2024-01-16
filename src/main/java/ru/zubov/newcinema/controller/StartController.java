package ru.zubov.newcinema.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.zubov.newcinema.model.User;
import ru.zubov.newcinema.service.UserService;

@Controller
@RequiredArgsConstructor
public class StartController {
    private final UserService userService;

    @GetMapping("/")
    public String home(@AuthenticationPrincipal User user) {
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/hello")
    public String hello(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", userService.findById(user.getId()).orElse(null));
        return "hello";
    }
}
