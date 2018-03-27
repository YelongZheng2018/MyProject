package com.myproject.controller.user;

import com.myproject.bean.user.User;
import com.myproject.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User queryUserInfo(@RequestParam int id) {
        User user = userService.queryUserById(id);
        return user;
    }
}
