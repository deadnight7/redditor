package com.cpandit.springit.controller;

import com.cpandit.springit.domain.Link;
import com.cpandit.springit.repository.LinkRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links")
public class LinkController {

    LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/")
    public List <Link> list() {
        return linkRepository.findAll();
    }

    @GetMapping("/queryByPage")
    public Page<Link> queryByPage(Pageable pageable) {
        Page<Link> pageInfo = linkRepository.findAll(pageable); //listByPage(pageable);
        return pageInfo;
    }

    @PostMapping("/create")
    public Link create(@RequestBody Link link) {
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id) {
        return linkRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        linkRepository.deleteById(id);
    }
}
