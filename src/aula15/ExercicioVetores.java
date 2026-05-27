package aula15;

import java.util.Random;


public class ExercicioVetores {

    public static void main(String[] args){
        /*
         * Você é um gerente de hotel e quer entender o fluxo de pessoas
         * por semana, durante 2 semanas
         * para poder fazer uma janta e com isso não faltar comida e evitar desperdício
         * Desta forma você precisa obter as seguintes informações:
         * Obs: (Lembrando que neste hotel o restaurante funciona os 7 dias da semana)
         *
         * Você pode fazer com os dados fixos, ou com os dados dinâmicos
         * através da inserção do usuário.
         * Número total de pessoas
         * Número total de pessoas na primeira Semana
         * Número total de pessoas na segunda Semana
         * Tirar uma média de pessoas por dia
         */

        Random random = new Random();
        int[] pessoasSemana1 = new int[7];
        int totalSemana1 = 0;
        int[] pessoasSemana2 = new int[7];
        int totalSemana2 = 0;


        for (int i = 0; i < 7; i++) {
            pessoasSemana1[i] = random.nextInt(10);
            totalSemana1 = totalSemana1 + pessoasSemana1[i];
        }

        System.out.println("Na semana 1 teve " + totalSemana1 + " pessoas");





        for (int i = 0; i < 7; i++) {
            pessoasSemana2[i] = random.nextInt(40);
            totalSemana2 = totalSemana2 + pessoasSemana2[i];
        }

        System.out.println("Na semana 2 teve " + totalSemana2 + " pessoas");
        int totalPessoas;
        totalPessoas = totalSemana1 + totalSemana2;

        System.out.println("No total teve " + totalPessoas + " pessoas");
        int mediaDiaria = totalPessoas/14;
        System.out.println("E a média diária foi: " + mediaDiaria );
    }
}