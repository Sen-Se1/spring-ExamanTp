package com.app.examantp.repo;

import com.app.examantp.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepo extends JpaRepository<Voiture,Integer> {
}
