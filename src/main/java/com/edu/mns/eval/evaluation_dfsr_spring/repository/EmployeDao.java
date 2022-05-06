package com.edu.mns.eval.evaluation_dfsr_spring.repository;


import com.edu.mns.eval.evaluation_dfsr_spring.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeDao extends JpaRepository<Employe, Integer> {

    int countByAdministrateur(boolean a);

    boolean existsByLogin(String login);
}
