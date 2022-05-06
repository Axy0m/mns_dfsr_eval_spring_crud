package com.edu.mns.eval.evaluation_dfsr_spring.model;

import com.edu.mns.eval.evaluation_dfsr_spring.view.AffichageCommande;
import com.edu.mns.eval.evaluation_dfsr_spring.view.AffichageUtilisateur;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonView(AffichageUtilisateur.class)
    private String nom;

    @JsonView(AffichageCommande.class)
    private float prix;

    @ManyToOne
    private Employe gestionnaire;
}
