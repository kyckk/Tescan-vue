package com.example.springboot.back.login.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    @Qualifier(value = "login")
    private final LoginService loginService;
    
    @GetMapping("/api/account/login")
    public int getList(){
        loginService.getList();
        return 1;
    }
}
