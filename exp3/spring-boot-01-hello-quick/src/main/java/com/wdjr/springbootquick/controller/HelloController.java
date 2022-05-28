package com.wdjr.springbootquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//这个类的所有方法返回的数据直接返回给浏览器（如果是对象转为json数据）

@RestController
public class HelloController {

    @GetMapping("/hello")
    public  String  hello(HttpServletRequest request, @RequestParam("name") String name){
        System.out.println(name);
        //第一步：获取session
        HttpSession session = request.getSession();
        //第二步：将想要保存到数据存入session中
        session.setAttribute("name",name);
        return "hello world "+name;
    }
    //REST API
}




//http://localhost:9000/hello?name=%22zyz%22