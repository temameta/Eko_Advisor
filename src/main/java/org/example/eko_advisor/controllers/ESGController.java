package org.example.eko_advisor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/esg")
public class ESGController {
    public String getEsg() {
        return "esg.html";
    }
}
