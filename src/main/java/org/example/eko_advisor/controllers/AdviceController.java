package org.example.eko_advisor.controllers;

import org.example.eko_advisor.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/advice")
public class AdviceController {
    private final AdviceService adviceService;

    @Autowired
    public AdviceController(AdviceService adviceService) {
        this.adviceService = adviceService;
    }

    @GetMapping
    public String getAdvice(Model model) {
        System.out.println(adviceService.getAdvice());
        model.addAttribute("advice", adviceService.getAdvice());
        return "advice";
    }
}
