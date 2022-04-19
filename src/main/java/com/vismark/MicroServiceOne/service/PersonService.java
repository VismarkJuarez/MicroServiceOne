package com.vismark.MicroServiceOne.service;

import com.vismark.MicroServiceOne.domain.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PersonService {
    private Set<Person> allPeople = new HashSet<Person>();

    public void addPerson(Person person){
        allPeople.add(person);
    }

    public Set<Person> getAllPeople() {
        return new HashSet<Person>(allPeople);
    }
}
