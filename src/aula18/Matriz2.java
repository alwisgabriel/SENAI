package aula18;

import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int [] [] matriz = new int[3][3];
        System.out.println("Digite a quantidade de alunos");
        int qtAlunos = input.nextInt();
        System.out.println("Digite a quantidade de notas");
        int qtNotas = input.nextInt();
        for(int i = 0; i < qtAlunos; i++) {
            matriz [i][0] = i;
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite a %d nota", j +1);
                matriz [i][j] = input.nextInt();

            }
        }

        for (int i = 0; i < qtAlunos; i++) {
            System.out.printf("Aluno id: %d", i);
            for (int j = 0; j < qtNotas; j++) {
                System.out.printf("Notas%d = %d", matriz[i][j]);
                System.out.println();
            }
        }
    }
}
