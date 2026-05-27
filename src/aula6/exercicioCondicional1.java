package aula6;
import java.util.Scanner;

public class exercicioCondicional1 {
    static void main() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Você possui um ticket válido? [1] Sim [2] Não");
        int ticket = scanner.nextInt();

        if (ticket == 1) {
            System.out.println("Cancela abre");
        } else if (ticket == 2){
            System.out.println("Cancela não abre");
        }

        else {
            System.out.println("Opção errada, selecione novamente");
        }
    }
}
