package aula10;

import java.util.Random;

public class ExercicioCombinado {
    public static void main(String[] args) {
        /*Em um Estacionamento o dono do local não sabe ao certo e seu faturamento com isso ele decidiu fazer
         * o sistema para controlar o local, você foi contratado para criar um sistema de rotatividade
         * para o estacionamento, o cliente solicitou as seguintes informações:
         * Quantos carros passaram por turno no local
         * Quantos carros passaram por vaga no local
         * Caso a quantidade media de carros por turno seja abaixo de 500 emitir mensagem de alerta*/


        Random numeroAleatorio = new Random();

        String[] turnos = {"Manhã", "Tarde", "Noite"};

        for (int i = 0; i < 3; i++) {

            int carros = numeroAleatorio.nextInt(100) + 1;
            System.out.println("\n" + turnos[i] + ": " + carros + " carros passaram");

            int[] vagas = new int[3];


            for (int c = 0; c < carros; c++) {
                int vagaEscolhida = numeroAleatorio.nextInt(3);
                vagas[vagaEscolhida]++;
            }


            for (int v = 0; v < 3; v++) {
                System.out.println("Vaga " + (v + 1) + ": " + vagas[v] + " carros");
            }
        }
    }
}