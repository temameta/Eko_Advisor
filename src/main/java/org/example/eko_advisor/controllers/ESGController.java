package org.example.eko_advisor.controllers;

import org.example.eko_advisor.service.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/esg")
public class ESGController {
    private final MapperService mapperService;

    @Autowired
    public ESGController(MapperService mapperService) {
        this.mapperService = mapperService;
    }

    @GetMapping
    public String getEsg(Model model) {
        model.addAttribute("esg", mapperService.getESG());
        System.out.println(mapperService.getESG());
        return "esg";
    }
}
