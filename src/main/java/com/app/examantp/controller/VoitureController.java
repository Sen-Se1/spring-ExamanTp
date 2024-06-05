package com.app.examantp.controller;

import com.app.examantp.entity.Voiture;
import com.app.examantp.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Voitures")
public class VoitureController {
    @Autowired
    private VoitureService voiture;

    @PostMapping("")
    public Voiture saveVoiture(@RequestBody Voiture v){
        return voiture.save(v);
    }

    @GetMapping("")
    public List<Voiture> listVoiture(){
        return voiture.list();
    }

    @GetMapping("/{id}")
    public Voiture getVoiture(@PathVariable(name = "id") int id) throws Exception {
        return voiture.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteVoiture(@PathVariable(name = "id") int id) throws Exception {
        voiture.delete(id);
    }
}
