package com.vismark.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping("/")
    public String greeting(){
        return "hello.";
    }

    @RequestMapping(
            method=RequestMethod.GET,
            value="/name/{age}"
    )
    public String greetingWithDetails(@PathVariable int age,
                                   @RequestParam String firstName,
                                   @RequestParam String lastName){
        StringBuilder sb = new StringBuilder(firstName);
        sb.append(" ");
        sb.append(lastName);
        sb.append(": ");
        sb.append(age);
        return sb.toString();
    }

}
