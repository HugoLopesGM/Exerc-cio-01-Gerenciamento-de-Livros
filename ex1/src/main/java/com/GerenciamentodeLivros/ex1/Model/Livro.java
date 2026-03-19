package com.GerenciamentodeLivros.ex1.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_titulo")
    private String titulo;

    @Column(name = "nome_autor")
    private String autor;

    private Integer anoDePublicação;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoDePublicação() {
        return anoDePublicação;
    }

    public void setAnoDePublicação(Integer anoDePublicação) {
        this.anoDePublicação = anoDePublicação;
    }
}
