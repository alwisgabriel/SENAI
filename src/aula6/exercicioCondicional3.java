package aula6;

import java.util.Scanner;

public class exercicioCondicional3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("O cliente é premium? [1] Sim [2] Não");
        int cliente = entrada.nextInt();

        System.out.println("Qual o valor da compra?");
        double compra = entrada.nextDouble();

        if (cliente == 1 && compra > 300) {
            double resultado = compra * 0.8;
            System.out.println("Valor final ficou  " + resultado);

        } else if (cliente == 2 && compra > 300) {
            double resultado = compra * 0.9;
            System.out.println("Valor final ficou  " + resultado);

        } else {
            System.out.println("Não recebe desconto");
        }
    }
}