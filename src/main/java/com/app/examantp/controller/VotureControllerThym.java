package com.app.examantp.controller;

import com.app.examantp.entity.Voiture;
import com.app.examantp.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Voitures")
public class VotureControllerThym {
    @Autowired
    private VoitureService voitureService;

    @GetMapping("/thymeleaf")
    public String homePage(Model model) {
        model.addAttribute("voilist", voitureService.list());
        return "index";
    }

    @GetMapping("/thymeleaf/addnew")
    public String addNewVoiture(Model model) {
        Voiture v = new Voiture();
        model.addAttribute("voiture", v);
        return "addVoiture";
    }
    @PostMapping("/thymeleaf/save")
    public String saveVoiture(@ModelAttribute("voiture") Voiture v) {
        voitureService.save(v);
        return "redirect:/Voitures/thymeleaf";
    }


}
