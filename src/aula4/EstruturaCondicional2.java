package aula4;

public class EstruturaCondicional2 {
    public static void main(String[] args) {
        int x = 5, y = 2, z = 10, a = 50;

        if (x == 2 || x == z / y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (x >= a || z >= a / 5) {
            System.out.println("True2");
        } else {
            System.out.println("False2");
        }
    }
}