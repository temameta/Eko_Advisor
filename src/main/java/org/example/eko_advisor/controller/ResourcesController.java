package org.example.eko_advisor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resources")
public class ResourcesController {
    @GetMapping
    public String resources(){
        return "resources";
    }
}
