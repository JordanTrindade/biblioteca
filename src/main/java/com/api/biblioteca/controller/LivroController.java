package com.api.biblioteca.controller;

import com.api.biblioteca.domain.Livro;
import com.api.biblioteca.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public ResponseEntity<List<Livro>> listarLivros(){
        List<Livro> livros = livroService.listarLivros();
        return ResponseEntity.status(HttpStatus.OK).body(livros);
    }

}
