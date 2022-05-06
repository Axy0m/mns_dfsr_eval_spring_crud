package com.edu.mns.eval.evaluation_dfsr_spring.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class CleCaracteristique implements Serializable {
    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "propriete_id")
    private Integer proprieteId;
}
