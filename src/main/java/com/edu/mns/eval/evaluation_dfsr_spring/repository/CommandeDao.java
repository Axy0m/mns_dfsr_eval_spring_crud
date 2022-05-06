package com.edu.mns.eval.evaluation_dfsr_spring.repository;

import com.edu.mns.eval.evaluation_dfsr_spring.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Integer> {
}
