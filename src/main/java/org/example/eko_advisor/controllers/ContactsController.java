package org.example.eko_advisor.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.eko_advisor.mappers.Contacts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.InputStream;

@Controller
@RequestMapping("/contacts")
public class ContactsController {
    @GetMapping
    public String getContacts(Model model) {
        ObjectMapper mapper = new ObjectMapper();
        Contacts contacts = null;
        try (InputStream inputStream = getClass()
                .getResourceAsStream("/data/contacts.json")) {
            contacts = mapper.readValue(inputStream, Contacts.class);
            model.addAttribute("creators", contacts.getCreators());


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "contacts";
    }
}
