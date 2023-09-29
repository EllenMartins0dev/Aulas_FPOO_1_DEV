package com.filmes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Diz que ele vai fazer o request e response
@RestController
@RequestMapping("/api/filmes")

public class FilmeController {

    private final FilmeRepository rp;

    public FilmeController(FilmeRepository filmeRp) {
        this.rp = filmeRp;
    }
// Busca uma informação
    @GetMapping
    public List<Filme> getAll() {
        return this.rp.findAll();
    }

}
