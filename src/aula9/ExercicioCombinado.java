package aula9;

import java.util.Random;

public class ExercicioCombinado {
    public static void main(String[] args) {
        Random random = new Random();
        int maquina;
        int mediaTurno1 = 0;
        int mediaTurno2 = 0;
        int mediaTurno3 = 0;

        for (int i = 0; i < 5; i++) {
            maquina = random.nextInt(200);
            System.out.println("Máquina " + (i + 1) + " produziu " + maquina + " peças no turno Manhã");
            if (maquina < 100) {
                System.out.println("Alerta: baixa produtividade no turno Manhã");
            }
            mediaTurno1 += maquina;
        }
        System.out.println("Média do turno Manhã: " + (mediaTurno1 / 5.0));
        System.out.println();

        for (int i = 0; i < 5; i++) {
            maquina = random.nextInt(200);
            System.out.println("Máquina " + (i + 1) + " produziu " + maquina + " peças no turno Tarde");
            if (maquina < 100) {
                System.out.println("Alerta: baixa produtividade no turno Tarde");
            }
            mediaTurno2 += maquina;
        }
        System.out.println("Média do turno Tarde: " + (mediaTurno2 / 5.0));
        System.out.println();

        for (int i = 0; i < 5; i++) {
            maquina = random.nextInt(200);
            System.out.println("Máquina " + (i + 1) + " produziu " + maquina + " peças no turno Noite");
            if (maquina < 100) {
                System.out.println("Alerta: baixa produtividade no turno Noite");
            }
            mediaTurno3 += maquina;
        }
        System.out.println("Média do turno Noite: " + (mediaTurno3 / 5.0));
    }
}