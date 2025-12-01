package org.example.eko_advisor.controllers;

import org.example.eko_advisor.service.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/advice")
public class AdviceController {
    private final MapperService mapperService;

    @Autowired
    public AdviceController(MapperService mapperService) {
        this.mapperService = mapperService;
    }

    @GetMapping
    public String getAdvice(Model model) {
        System.out.println(mapperService.getAdvice());
        model.addAttribute("advice", mapperService.getAdvice());
        return "advice";
    }
}
