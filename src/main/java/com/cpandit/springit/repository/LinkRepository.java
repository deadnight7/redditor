package com.cpandit.springit.repository;

import com.cpandit.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository <Link, Long> {

    Link findByTitle (String strTitle);

    List <Link> findByTitleLikeOrderByCreationDateDesc (String strTitle);

}
