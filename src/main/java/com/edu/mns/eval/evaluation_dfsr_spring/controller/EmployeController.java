package com.edu.mns.eval.evaluation_dfsr_spring.controller;


import com.edu.mns.eval.evaluation_dfsr_spring.model.Employe;
import com.edu.mns.eval.evaluation_dfsr_spring.repository.EmployeDao;
import com.edu.mns.eval.evaluation_dfsr_spring.view.AffichageUtilisateur;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeController {

    private EmployeDao employeDao;

    @Autowired
    public EmployeController(EmployeDao employeDao) {
        this.employeDao = employeDao;
    }

    // ***********  METHODE GET **************************

    @GetMapping("/employe/{id}")
    @JsonView(AffichageUtilisateur.class)
    public Employe employe(@PathVariable Integer id) {

        return employeDao.findById(id).orElse(null);
    }

    @GetMapping("/liste-employe")
    @JsonView(AffichageUtilisateur.class)
    public List<Employe> listeEmploye() {

        return employeDao.findAll();
    }

    @GetMapping("/compte-administrateur")
    public int compteAdministrateur() {

        return employeDao.countByAdministrateur(true);
    }

}
