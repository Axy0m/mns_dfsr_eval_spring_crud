package com.edu.mns.eval.evaluation_dfsr_spring.controller;


import com.edu.mns.eval.evaluation_dfsr_spring.repository.EmployeDao;
import com.edu.mns.eval.evaluation_dfsr_spring.repository.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UtilisateurController {

    private UtilisateurDao utilisateurDao;
    private EmployeDao employeDao;

    @Autowired
    public UtilisateurController(UtilisateurDao utilisateurDao, EmployeDao employeDao) {

        this.employeDao = employeDao;
        this.utilisateurDao = utilisateurDao;
    }

    // ***********  METHODE GET **************************

    @GetMapping("/compte-utilisateur")
    public int compteUtilisateur() {

        return utilisateurDao.compteUtilisateur();
    }


    // ***********  METHODE DELETE  **************************

    @DeleteMapping("/utilisateur/{login}")
    public void deleteUtilisateur(@PathVariable String login) {

        if(!employeDao.existsByLogin(login)) {

            utilisateurDao.deleteByLogin((login));
        }
    }

}
