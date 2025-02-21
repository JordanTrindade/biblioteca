package com.api.biblioteca.service;

import com.api.biblioteca.domain.Livro;
import com.api.biblioteca.exception.NotFoundException;
import com.api.biblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> ListarLivros(){
        return livroRepository.findAll();
    }

    public Livro buscaLivroPorId(Integer id){
        //tratar erro
        return livroRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public Livro salvarLivro(Livro livro){
        return livroRepository.save(livro);
    }


    public void deletarLivro(Integer id){
         livroRepository.deleteById(id);
    }
}
