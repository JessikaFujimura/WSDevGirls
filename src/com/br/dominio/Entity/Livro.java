package com.br.dominio.Entity;

public class Livro {

    private Integer codigoLivro;
    private String nome;
    private String autor;

    public Livro(Integer codigoLivro, String nome, String autor){
        this.codigoLivro = codigoLivro;
        this.nome = nome;
        this.autor = autor;
    }

    public Integer getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(Integer codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void imprimirLivro() {
        System.out.println("\n" + "Codigo livro = " + codigoLivro + "\n"+
                "Nome do livro = " + nome + "\n" +
                "Autor do livro = " + autor + "\n"
        );
    }
}
