package com.cpandit.springit.domain;

//import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

//@Data
//@RequiredArgsConstructor
//@Getter @Setter
//@ToString
//@NoArgsConstructor
@Entity
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private  Long id;

    //@NonNull
    private String body;

    @ManyToOne
   // @NonNull
    private Link link;
    //Vote


    public Comment() {
    }

    public Comment(String body, Link link) {
        this.body = body;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}

