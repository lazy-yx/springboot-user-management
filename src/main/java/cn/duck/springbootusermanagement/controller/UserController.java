package cn.duck.springbootusermanagement.controller;

import cn.duck.springbootusermanagement.entity.User;
import cn.duck.springbootusermanagement.service.UserService;
import cn.duck.springbootusermanagement.utils.JwtUtil;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {

        userService.register(user);

        return "register success";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User dbUser = userService.login(user.getUsername(), user.getPassword());

        if (dbUser == null) {
            return "login failed";
        }

        return JwtUtil.generateToken(dbUser.getUsername());
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {

        return userService.getUserById(id);

    }

}