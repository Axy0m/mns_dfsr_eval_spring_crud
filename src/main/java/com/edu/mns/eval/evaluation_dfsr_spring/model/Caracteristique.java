//package com.edu.mns.eval.evaluation_dfsr_spring.model;
//
//
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Getter
//@Setter
//@Entity
//@EntityListeners(AuditingEntityListener.class)
//public class Caracteristique implements Serializable {
//
//    private String valeur;
//
//    @Id
//    private Integer articleId;
//
//    @Id
//    private Integer proprieteId;

//    @ManyToOne
//    @MapsId
//    @JoinColumn
//    private Article article;
//
//    @ManyToOne
//    @MapsId("propriete_id")
//    @JoinColumn(name = "propriete_id")
//    private Propriete propriete;
//}
