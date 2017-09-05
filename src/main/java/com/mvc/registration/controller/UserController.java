package com.mvc.registration.controller;

import com.mvc.registration.model.User;
import com.mvc.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public ModelAndView validateUsers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("userscheck");
        return modelAndView;
    }
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public @ResponseBody String checkUsers(@ModelAttribute("userFromServer") User user){
        if ("admin".equals(user.getLogin()) && "admin".equals(user.getPassword())) {
            return "valid";
        }
        return "invalid";
    }
}