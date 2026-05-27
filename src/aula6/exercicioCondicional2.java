package aula6;

import java.util.Scanner;

public class exercicioCondicional2 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("O aluno está matriculado? [1] Sim [2] Não");
        String aluno = entrada.nextLine();

        if (aluno.toUpperCase().equals("SIM") || aluno.equals("1")) {
            System.out.println("Acesso liberado");


        } else if (aluno.toUpperCase().equals("NÃO") || aluno.toUpperCase().equals("NAO") || aluno.equals("2")) {
            System.out.println("Acesso negado");

        } else {
            System.out.println("Escreva sim ou não, ou digite 1 ou 2.");
        }

        entrada.close();
    }
}