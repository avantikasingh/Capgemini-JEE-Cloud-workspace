package com.cg.demosecurity.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

@GetMapping(value= {"/", "/welcome"})
public String welcome() {
return "WelcomePage";
}

@GetMapping(value="/admin")
public String myadmin() {
return "AdminPage";
}

@GetMapping(value="/user")
public String myuser() {
return "HomePage";
}

@GetMapping(value="/logoutApp")
public String logout(HttpServletRequest request, HttpServletResponse response) {
Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
       if (auth != null){      
          new SecurityContextLogoutHandler().logout(request, response, auth);  
       }  
return "redirect:/";
}
}