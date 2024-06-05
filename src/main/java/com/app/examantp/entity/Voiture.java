package com.app.examantp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nomProprietaire;
    private String matricule;
    private Date dateCreation;
}
