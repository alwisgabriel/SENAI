package Aula7;

import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args) {
        String turno = "Manhã";
        String turno2 = "Tarde";
        String turno3 = "Noite";
        Scanner entrada = new Scanner(System.in);
        int numeroTurno;
        System.out.println("Informe o seu horário de entrada");
        System.out.println("Que eu informarei seu turno");
        numeroTurno = entrada.nextInt();

        switch (numeroTurno) {
            case 1:
                System.out.printf("Você trabalha no turno da %s\n",turno);
                System.out.println("Seu horário de entrada é ");
                System.out.println("Das 08:00 as 12:00 e 13:00 as 17:00 ");
    break  ;
            case 2:
                System.out.printf("Você trabalha no turno da %s\n",turno2);
                System.out.println("Seu horário de entrada é ");
                System.out.println("Das 14:00 as 18:00 e 19:00 as 23:00 ");
                break;
            case 3:
                System.out.printf("Você trabalha no turno da %s\n",turno3);
                System.out.println("Seu horário de entrada é ");
                System.out.println("Das 22:00 as 02:00 e 03:00 as 07:00 ");
                break;

            default:
                System.err.println("Informe um número entre 1 e 3");
        }

    }
}
