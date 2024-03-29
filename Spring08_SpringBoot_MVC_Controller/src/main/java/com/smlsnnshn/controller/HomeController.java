package com.smlsnnshn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping1(){
        return "home";
    }

    @RequestMapping(method=RequestMethod.GET,value="/ozzy")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST,value="/cybertek")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/spring") //shortcut for method=RequestMethod.GET
    public String getMappingEx(){
        return "home";
    }

    @PostMapping("/spring") //shortcut for method=RequestMethod.POST
    public String postMappingEx2(){
        return "home";
    }

    @GetMapping("/home/{name}")              //used as a path parameter
    public String pathVariableEx1(@PathVariable("name") String name){
        System.out.println("name is: " + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")     //used as a path parameter
    public String pathVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("name is: " + name);
        System.out.println("email is: " + email);
        return "home";
    }

    @GetMapping("/home/course")    //used as a query parameter
    public String requestParamEx1(@RequestParam("course") String course){
        System.out.println("name is: " + course);
        return "home";
    }

    @GetMapping(value="/course2")  //used as a query parameter
    public String requestParamEx2(@RequestParam(value="course2", required=false, defaultValue="cybertek") String name){
        System.out.println("name is: " + name);
        return "home";
    }

}
