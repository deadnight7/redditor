package com.cpandit.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
public class Vote extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    //User

    //Link

}

