package com.GerenciamentodeLivros.ex1.controller;

import com.GerenciamentodeLivros.ex1.Model.Livro;
import com.GerenciamentodeLivros.ex1.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Livros")
public class LivroController {
    @Autowired
    private LivroService livroService;


    @GetMapping
    public ResponseEntity<List<Livro>>findAll(){
    List<Livro> livros = livroService.listarTodos();
    return ResponseEntity.ok().body(livros);

    }

    @PostMapping
    public ResponseEntity<Livro> criarLivro(@RequestBody Livro livro ){
        Livro livroSalvo = livroService.criarLivro(livro);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(livroSalvo.getId())
                .toUri();
        return ResponseEntity.created(uri).body(livroSalvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id){
        livroService.deletarLivro(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/{id}")
    public Optional<Livro>buscarId(@PathVariable Long id){
        return livroService.buscaLivro(id);
    }

}
