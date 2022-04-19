package com.vismark.MicroServiceOne.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping("/")
    public String greeting(){
        return "hello.";
    }

    // http://localhost:{port}/person?age=26&firstName=Vismark&lastName=Juarez
    // i.e: http://localhost:8080/person?age=26&firstName=Vismark&lastName=Juarez
    @RequestMapping(
            method=RequestMethod.GET,
            value="/person"
    )
    public String greetingWithDetails(@RequestParam int age,
                                      @RequestParam String firstName,
                                      @RequestParam String lastName){
        StringBuilder sb = new StringBuilder(firstName);
        sb.append(" ");
        sb.append(lastName);
        sb.append(": ");
        sb.append(age);
        return sb.toString();
    }

    @RequestMapping(
            method=RequestMethod.POST,
            value="/person"
    )
    public String addPerson(@RequestParam int age,
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
