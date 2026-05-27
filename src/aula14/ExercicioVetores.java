package aula14;

import java.util.Scanner;

public class ExercicioVetores {
    public static void main(String[] args) {

        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);

        int qtAlunos, qtNotas;

        System.out.printf("Quantos alunos você quer registrar?\n");
        qtAlunos = entradaNumero.nextInt();

        System.out.printf("Quantas notas você quer registrar?\n");
        qtNotas = entradaNumero.nextInt();

        String[] alunos = new String[qtAlunos];
        int[] notas = new int[qtNotas];
        double [] mediaAlunos = new double[qtAlunos];

        for (int i = 0; i < qtAlunos; i++) {

            System.out.printf("Digite o nome do aluno:\n");
            alunos[i] = entradaTexto.nextLine();

            for (int n = 0; n < qtNotas; n++) {

                System.out.printf("Digite a nota %d do aluno:\n", n + 1);
                notas[n] = entradaNumero.nextInt();
                mediaAlunos[i] += notas[n];
            }
        }
        System.out.printf("Segue abaixo a relação das médias dos alunos:");
        for (int j = 0; j <qtAlunos; j++) {
            System.out.printf("O Aluno %s teve a média %.2f",alunos[j],mediaAlunos[j]/qtNotas);
        }
    }
}