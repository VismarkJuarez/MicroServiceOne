package com.vismark.MicroServiceOne.controller;

import com.vismark.MicroServiceOne.domain.Person;
import com.vismark.MicroServiceOne.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class Controller {

    @Autowired
    PersonService personService;

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
    public ResponseEntity<Person> greetingWithDetails(@RequestParam int age,
                                                      @RequestParam String firstName,
                                                      @RequestParam String lastName){

        Person newPerson = new Person(firstName, lastName, age);
        return new ResponseEntity<Person>(newPerson, HttpStatus.OK);
    }

    @RequestMapping(
            method=RequestMethod.GET,
            value="/all"
    )
    public ResponseEntity<Set<Person>> retrieveAllPersons(){
        Set<Person> allPersons = personService.getAllPeople();
        return new ResponseEntity<Set<Person>>(allPersons, HttpStatus.OK);
    }

    @RequestMapping(
            method=RequestMethod.POST,
            value="/person"
    )
    public ResponseEntity<String> addNewPerson(@RequestBody Person person){
        personService.addPerson(person);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
