package com.GerenciamentodeLivros.ex1.Service;

import com.GerenciamentodeLivros.ex1.Model.Livro;
import com.GerenciamentodeLivros.ex1.repository.RepositorioLivro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private RepositorioLivro repositorioLivro;

    public Livro criarLivro(Livro livro){
        return repositorioLivro.save(livro);

    }

    public List<Livro> listarLivro(){
        return repositorioLivro.findAll();
    }

    public Optional<Livro>BuscaLivro(Long id){
        return repositorioLivro.findById(id);
    }

    public void deletarLivro(Long id){
        repositorioLivro.deleteById(id);
    }

}
