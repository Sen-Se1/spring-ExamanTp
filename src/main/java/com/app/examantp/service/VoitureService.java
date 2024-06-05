package com.app.examantp.service;

import com.app.examantp.entity.Voiture;
import com.app.examantp.repo.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureService {
    @Autowired
    private VoitureRepo voiture;

    public Voiture save(Voiture v){
        return voiture.saveAndFlush(v);
    }

    public List<Voiture> list(){
        return voiture.findAll();
    }

    public Voiture getById(int id) throws Exception {
        return voiture.findById(id).orElseThrow(
                ()->new Exception("Voiture not fount !")
        );
    }

    public void delete(int id) throws Exception {
        voiture.delete(this.getById(id));
    }
}
