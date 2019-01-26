package com.cpandit.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private  Long id;

    @NonNull
    private String body;

    @ManyToOne
    private Link link;
    //Vote

}

