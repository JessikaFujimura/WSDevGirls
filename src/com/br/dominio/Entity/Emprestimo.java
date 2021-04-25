package com.br.dominio.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Emprestimo {

    private Integer codigoSolitacao;
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataSolitacao;
    private LocalDate dataDevolucao;

    public Emprestimo(
            Integer codigoSolitacao,
            Usuario usuario,
            Livro livro,
            LocalDate dataSolitacao,
            LocalDate dataDevolucao
    ){
        this.codigoSolitacao = codigoSolitacao;
        this.usuario = usuario;
        this.livro = livro;
        this.dataSolitacao = dataSolitacao;
        this.dataDevolucao = dataDevolucao;
    }

    public Integer getCodigoSolitacao() {
        return codigoSolitacao;
    }

    public void setCodigoSolitacao(Integer codigoSolitacao) {
        this.codigoSolitacao = codigoSolitacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataSolitacao() {
        return dataSolitacao;
    }

    public void setDataSolitacao(LocalDate dataSolitacao) {
        this.dataSolitacao = dataSolitacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void imprimirEmprestimo(){
        System.out.println( "\n" +"Código do empréstimo = " + codigoSolitacao + "\n" +
                "Código/Nome do usuário = " + usuario.getCodigoUsuario() + " - " + usuario.getNomeCompleto() + "\n" +
                "Código/Nome do livro = " + livro.getCodigoLivro() + " - " + livro.getNome() +",\n" +
                "Data de solicitação = " + dataSolitacao +",\n" +
                "Data de devolução = " + dataDevolucao );
    }
}
