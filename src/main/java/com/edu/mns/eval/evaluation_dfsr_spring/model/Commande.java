package com.edu.mns.eval.evaluation_dfsr_spring.model;


import com.edu.mns.eval.evaluation_dfsr_spring.view.AffichageCommande;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date datePaiement;

    @ManyToOne
    @JsonView(AffichageCommande.class)
    private Utilisateur client;

    @OneToMany(mappedBy = "commande")
    @JsonView(AffichageCommande.class)
    private List<LigneCommande> listeLigneCommande;
}
