package aula4;

public class EstruturaCondicional {
    public static void  main(String[] args) {
        int x = 5, y = 10, z = 2;
        if(x == y) {
            System.out.printf("X é igual a Y");
        } else if (x == y/z) {
            System.out.printf("X é igual a y dividido por z");

        }
        else {
            System.out.printf("Não temos letras iguais");
        }
    }
}
