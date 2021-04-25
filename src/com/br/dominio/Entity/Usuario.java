package com.br.dominio.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Usuario {

    private Integer codigoUsuario;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;
    private String endereco;

    public Usuario(Integer codigoUsuario, String nomeCompleto, LocalDate dataDeNascimento, String endereco){
        this.codigoUsuario = codigoUsuario;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public void imprimirUsuario() {
        System.out.println("\n" + "Codigo do usuário = " + codigoUsuario + "\n" +
                "Nome completo = " + nomeCompleto + "\n" +
                "Data de nascimento = " + dataDeNascimento + "\n" +
                "Endereco = " + endereco +"\n"
        );

    }
}
