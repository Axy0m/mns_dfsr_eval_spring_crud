package com.edu.mns.eval.evaluation_dfsr_spring.model;


import com.edu.mns.eval.evaluation_dfsr_spring.view.AffichageCommande;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class LigneCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonView(AffichageCommande.class)
    private Integer quantite;

    @ManyToOne
    private Commande commande;

    @ManyToOne
    @JsonView(AffichageCommande.class)
    private Article article;


}
