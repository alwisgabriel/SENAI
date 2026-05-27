package Aula7;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    String tipoUsuario;
        System.out.println("Escreva o seu tipo de usuario");
        System.out.printf("Gerente\nSurpervisor\nVendedor\n");
        tipoUsuario = entrada.nextLine();
        switch (tipoUsuario) {
            case "Gerente":
                System.out.println("Tem acesso total aos módulos");
                break;

            case "Supervisor":
                System.out.println("Tem acesso aos módulos de dashboard" + "e vendas");

                break;

            case "Vendedor":
                System.out.println("Tem acesso apenas aos módulos de vendas");
                break;
        }

    }
    }

