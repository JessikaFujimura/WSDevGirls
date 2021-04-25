package com.br.dominio;

import com.br.dominio.Entity.Emprestimo;
import com.br.dominio.Entity.Livro;
import com.br.dominio.Entity.Usuario;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Biblioteca {


    public static void main(String[] args) {
        boolean validator = true;

        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("**** CADASTRO DE USUÁRIO ****");

        System.out.println("Informe o nome do usuário: ");
        String nomeUsuario = sc.nextLine();

        System.out.println("Informe a data de nascimento do usuário: (ano-mes-dia) ");
        String dNascUsuario =  sc.nextLine();

        System.out.println("Informe o endereço: ");
        String endUsuario = sc.nextLine();

        Usuario user = new Usuario(
                random.nextInt(100),
                nomeUsuario,
                LocalDate.parse(dNascUsuario),
                endUsuario
        );

        user.imprimirUsuario();

        System.out.println("**** CADASTRO DE LIVRO ****");

        System.out.println("Informe o nome do livro: ");
        String nomeLivro = sc.nextLine();

        System.out.println("Informe o nome do autor do livro: ");
        String autorLivro =  sc.nextLine();

        Livro livro = new Livro(random.nextInt(1000), nomeLivro, autorLivro);

        livro.imprimirLivro();

        System.out.println("**** CADASTRO DE EMPRESTIMO ****");

        while (validator){
            System.out.println("Informe a data de solicitação: (ano-mes-dia)");
            String dataSolicitacao = sc.nextLine();

            System.out.println("Informe a data de devolução: (ano-mes-dia)");
            String dataDevolucao =  sc.nextLine();

            LocalDate dtS = LocalDate.parse(dataSolicitacao);
            LocalDate dtD = LocalDate.parse(dataDevolucao);

            if(dtD.isBefore(dtS)){
                System.out.println("Data de devolução é inválida! A data de devolução deve ser posterior a data de solicitação.");
            }
            else {
                validator = false;
                Emprestimo emprestimo = new Emprestimo(
                        random.nextInt(1000),
                        user,
                        livro,
                        dtS,
                        dtD
                );
                emprestimo.imprimirEmprestimo();
            }
        }

        sc.close();
    }



}
