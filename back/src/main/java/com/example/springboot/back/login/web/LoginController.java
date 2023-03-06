package com.example.springboot.back.login.web;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.springboot.back.login.entity.Login;
import com.example.springboot.back.login.entity.LoginRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@CrossOrigin
@RestController
public class LoginController {
  
    private final LoginRepository loginRepository;

    @GetMapping("/api/account/login")
    public String getList(@RequestBody Map<String , String> params, HttpServletRequest request,Model model){
        System.out.println(params.get("contentId"));
        System.out.println(params.get("contentPw"));
        HttpSession session = request.getSession();
         Login login= loginRepository.findByContentIdAndContentPw(params.get("contentId"),params.get("contentPw"));
        if(login != null){
            //session.setAttribute(SessionConst.LOGIN_MEMBER, login);
            System.out.println(session.getAttribute("loginUser"));
            System.out.println(session);
            
            return login.getContentNo();
        }else{
            session.setAttribute("loginUser", null);
        }
       
         return "0";
    }
    


}
