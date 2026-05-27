package aula5;
import java.util.Scanner;

public class OperadoraCredito {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        * Crie uma regra condicional, onde ela valide os seguintes pontos. Se a pessoa
        * não tiver divida, for maior ou igual a 18 anos, pode aprovar o emprestimos direto.
        * Se a essa tiver divida e o salário for maior que 5000 o emprestimo deverá cair
        * em análise. Se a pessoa tiver divida e o salario for menor que 5000 o sistema
        * deverá negar o emprestimo automaticamente
        *
        * */


        String nome, cpf;
        int idade, divida;
        double salario;

        System.out.println("Para socilitar um empréstimo, digite os seus dados");
        System.out.println("Digite seu nome por favor");
        nome = entrada.nextLine();
        System.out.println("Digite seu cpf por favor");
        cpf = entrada.nextLine();
        System.out.println("Digite sua idade por favor");
        idade = entrada.nextInt();
        System.out.println("Você possui dividas \n[1] para sim\n[2] Para não");
        divida = entrada.nextInt();


        if (divida == 2 && idade >= 18){
            System.out.println("Pode fazer empréstimo");


        } else if (divida == 1) {
            System.out.println("Digite seu salário por favor");
            salario = entrada.nextDouble();


            if (salario > 5000) {
                System.out.println("Empréstimo em analise");
            } else {
                System.out.println("Não pode fazer empréstimo");
            }
        }


    }
}
