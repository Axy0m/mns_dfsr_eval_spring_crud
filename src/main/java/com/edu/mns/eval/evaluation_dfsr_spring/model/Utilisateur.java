package com.edu.mns.eval.evaluation_dfsr_spring.model;


import com.edu.mns.eval.evaluation_dfsr_spring.view.AffichageCommande;
import com.edu.mns.eval.evaluation_dfsr_spring.view.AffichageUtilisateur;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(AffichageUtilisateur.class)
    private Integer id;

    @JsonView({AffichageCommande.class, AffichageUtilisateur.class})
    private String login;

    private String password;

    @ManyToMany
    private List<MoyenPaiement> moyenPaiementList;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandeList;
}
