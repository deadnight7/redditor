package com.cpandit.springit.domain;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
//@Data
//@RequiredArgsConstructor
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
public class Link extends Auditable {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;

    @NonNull
    private String url;

    //Comments
    @OneToMany(mappedBy = "link")
    @JsonIgnore
    private List <Comment> comments = new ArrayList<>();

    public Link(String title, String url) {
        //super();
        this.title = title;
        this.url = url;
    }

    public Link() {
    }

    public void addComment (Comment comment){
        comments.add(comment);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
