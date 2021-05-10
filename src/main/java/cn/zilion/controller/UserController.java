package cn.zilion.controller;

import cn.zilion.pojo.User;
import cn.zilion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(path="/userRegistry")
    public String userRegistry(HttpServletRequest request) {
        User user = null;
        ModelAndView modelAndView;
        String responseString = null;
        HttpSession session = request.getSession();
        if(request.getParameter("verifycode").equals(session.getAttribute("verifycode"))) {
            user = fetchParameters(request);
            String userId = userService.addUser(user);
            modelAndView = new ModelAndView();
            modelAndView.addObject("user", user);
            modelAndView.setViewName("userProfile");
        }
        return responseString;
    }

    private User fetchParameters(HttpServletRequest request) {
        User user = null;
        return user;
    }
}
