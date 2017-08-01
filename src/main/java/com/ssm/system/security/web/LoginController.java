package com.ssm.system.security.web;

import com.ssm.Users;
import com.ssm.system.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chaoqunshe on 7/27/17.
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        Users users = userService.getUserById(1);
        System.out.println("username=" + users.getUsername());
        System.out.println("passworld=" + users.getPassword());
        model.addAttribute("user",users);
        return "login";
    }
}
