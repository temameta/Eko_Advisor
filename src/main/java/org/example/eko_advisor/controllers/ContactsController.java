package org.example.eko_advisor.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.eko_advisor.mappers.ContactsMapper;
import org.example.eko_advisor.mappers.CreatorsMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.InputStream;

@Controller
@RequestMapping("/contacts")
public class ContactsController {
    @GetMapping
    public String getContacts() {
        ObjectMapper mapper = new ObjectMapper();
        ContactsMapper contacts = null;
        try (InputStream inputStream = getClass()
                .getResourceAsStream("/data/contacts.json")) {
            contacts = mapper.readValue(inputStream, ContactsMapper.class);
            System.out.println(contacts.getCreators().get(0).getFirstName());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "contacts.html";
    }
}
