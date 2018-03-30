package com.example.demo.controller;

import com.demo.HelloService;
import com.example.demo.config.testproperties.BookProperties;
import com.example.demo.domain.Test;
import com.example.demo.domain.UserDo;
import com.example.demo.mapper.TestMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhangyang
 * @date 2018/1/5
 */
@Controller
public class IndexController {
    @Autowired
    BookProperties bookProperties;
    @Autowired
    HelloService helloService;
    @Autowired
    UserMapper userMapper;
    @Autowired
    TestMapper testMapper;



    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("book",bookProperties);
        return "index";
    }
    @RequestMapping("/starter")
    public @ResponseBody String sayHello(){
        return helloService.sayHello();
    }
    @RequestMapping("/selectAll")
    public @ResponseBody List<UserDo> selectAll(){
        return userMapper.selectAll();
    }
    @RequestMapping("/test")
    public @ResponseBody Test test(){
        return testMapper.selectByPrimaryKey(1);
    }
}
