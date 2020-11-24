package com.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }
    @RequestMapping("/emray")
    public String getRequestMapping2(){
        return "home";
    }
    @RequestMapping("/Pala")
    public String getRequestMapping3(){
        return "home";
    }
    @GetMapping("/greetings")
    public String getGreeting(){
        return "home";

    }

    @PostMapping("/welcome")
    public String getGreeting1(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("name is:"+ name);
        return "home";
    }
    @GetMapping("/home/{name}/{email}")
    //this method is returning the response from the URI
    public String pathVariableEx(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("name is:"+ name);
        System.out.println("email is:"+ email);
        return "home";
    }

    @GetMapping("home/welcome")
    public String requestParamEx(@RequestParam("welcome") String course){
        System.out.println("name is: "+course);
        return "home";
    }

    @GetMapping(value="/welcome")
    public String requestParam2(@RequestParam(value="name", required=false,defaultValue="Hello") String name){
        System.out.println("name is: "+ name);
        return "home";
    }
}
