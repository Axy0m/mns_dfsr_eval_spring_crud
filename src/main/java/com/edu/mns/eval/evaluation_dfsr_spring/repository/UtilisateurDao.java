package com.edu.mns.eval.evaluation_dfsr_spring.repository;


import com.edu.mns.eval.evaluation_dfsr_spring.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer> {

    @Query("SELECT COUNT(Utilisateur) FROM Utilisateur ")
    int compteUtilisateur();

    @Transactional
    void deleteByLogin(String login);
}
