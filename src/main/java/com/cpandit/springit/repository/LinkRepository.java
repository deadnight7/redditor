package com.cpandit.springit.repository;

import com.cpandit.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository <Link, Long> {

    

}
