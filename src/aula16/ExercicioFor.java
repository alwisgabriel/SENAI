package aula16;

import java.util.Scanner;

public class ExercicioFor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a quantidade de alunos?");
        int qtdAlunos = entrada.nextInt();
        entrada.nextLine();

        String[] alunos = new String[qtdAlunos];
        int[] idade = new int[qtdAlunos];
        String[] notasAluno = new String[qtdAlunos];

        System.out.println("Qual a quantidade de notas?");
        int qtdNotas = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < qtdAlunos; i++) {

            System.out.println("\nAluno " + (i + 1));

            System.out.println("Qual o nome do aluno?");
            alunos[i] = entrada.nextLine();

            System.out.println("Qual a idade do aluno?");
            idade[i] = entrada.nextInt();

            String notas = "";
            for (int j = 0; j < qtdNotas; j++) {
                System.out.println("Digite a nota " + (j + 1) + ":");
                int nota = entrada.nextInt();
                notas += "Nota " + (j + 1) + ": " + nota + "  ";
            }
            notasAluno[i] = notas;

            entrada.nextLine();
        }


        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Aluno: " + alunos[i] + "  Idade: " + idade[i] + "  " + notasAluno[i]);
        }



    }
}