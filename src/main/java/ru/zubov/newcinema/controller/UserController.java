package ru.zubov.newcinema.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.zubov.newcinema.model.User;
import ru.zubov.newcinema.model.mapper.UserMapper;
import ru.zubov.newcinema.service.UserService;

import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/{id}")
    public String getInfoUser(Model model, @PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        user.ifPresentOrElse(u -> model.addAttribute("user", userMapper.userToUserDto(u)),
                () -> model.addAttribute("error", "true"));
        return "hello";
    }


}
