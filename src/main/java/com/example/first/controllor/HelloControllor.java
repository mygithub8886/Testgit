package com.example.first.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllor {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("提交成功！！！");
        return "hello";
    }

    @RequestMapping("/index")
    public String sayGoodBy(){
        System.out.println("请输入账号和密码");
        return "login";
    }
}
