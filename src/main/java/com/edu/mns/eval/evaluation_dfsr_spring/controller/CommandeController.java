package com.edu.mns.eval.evaluation_dfsr_spring.controller;

import com.edu.mns.eval.evaluation_dfsr_spring.model.Commande;
import com.edu.mns.eval.evaluation_dfsr_spring.repository.CommandeDao;
import com.edu.mns.eval.evaluation_dfsr_spring.view.AffichageCommande;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CommandeController {

    private CommandeDao commandeDao;

    @Autowired
    public CommandeController(CommandeDao commandeDao) {
        this.commandeDao = commandeDao;
    }

    // ***********  METHODE GET **************************

    @GetMapping("/liste-commande")
    @JsonView(AffichageCommande.class)
    public List<Commande> commandes() {

        return commandeDao.findAll();
    }
}
