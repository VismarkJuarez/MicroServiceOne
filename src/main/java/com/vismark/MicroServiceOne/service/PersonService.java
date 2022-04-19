package com.vismark.MicroServiceOne.service;

import com.vismark.MicroServiceOne.domain.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    private List<Person> allPeople = new ArrayList<Person>();

    public void addPerson(Person person){
        allPeople.add(person);
    }

    public List<Person> getAllPeople() {
        return new ArrayList<Person>(allPeople);
    }
}
