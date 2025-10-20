package org.example.eko_advisor.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.eko_advisor.mappers.CreatorsMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

@Controller
@RequestMapping("/contacts")
public class ContactsController {
    public String getContacts() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            CreatorsMapper creatorsMapper = mapper.readValue(new File("contacts.json"), CreatorsMapper.class);
        } catch (Exception e) {
            System.out.println("Error reading contacts.json");
        }

        return "contacts.html";
    }
}
