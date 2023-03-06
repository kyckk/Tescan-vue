package com.example.springboot.back.login.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.springboot.back.login.entity.Login;
import com.example.springboot.back.login.entity.LoginRepository;





@Service
public class LoginService {
   @Autowired(required = true)
    @Qualifier(value = "LoginService")
   LoginRepository loginRepository;

    public int getList(){
        List<Login> row =loginRepository.findAll();
        System.out.println(row);
        return 1;
    }
}
