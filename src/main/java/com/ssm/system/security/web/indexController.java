package com.ssm.system.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chaoqunshe on 7/28/17.
 */
@Controller
public class indexController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "index";
    }
}
