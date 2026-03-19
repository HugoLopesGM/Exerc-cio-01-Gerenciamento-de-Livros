package com.GerenciamentodeLivros.ex1.repository;

import com.GerenciamentodeLivros.ex1.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLivro extends JpaRepository<Livro,Long> {
}
