package com.api.biblioteca.repository;

import com.api.biblioteca.domain.Livro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends MongoRepository<Livro, String> {

    @Query("{'nota' : { $gt: ?0}}")
    List<Livro> buscarPorNotaMaiorQue(Integer nota);
}
