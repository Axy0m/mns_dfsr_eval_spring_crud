package com.edu.mns.eval.evaluation_dfsr_spring.model;

import com.edu.mns.eval.evaluation_dfsr_spring.view.AffichageUtilisateur;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employe extends Utilisateur {

    @JsonView(AffichageUtilisateur.class)
    private boolean administrateur;

    @OneToMany(mappedBy = "gestionnaire")
    @JsonView(AffichageUtilisateur.class)
    private Set<Article> gestionArticle;
}
