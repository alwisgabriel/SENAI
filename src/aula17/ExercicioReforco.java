package aula17;

import java.util.Scanner;

public class ExercicioReforco {

    public static void main(String[] args) {

        Scanner entradatexto = new Scanner(System.in);
        Scanner entradanumero = new Scanner(System.in);

        System.out.println("Quantos funcionários quer cadastrar?");
        int qtdFuncionarios = entradanumero.nextInt();

        String[] nomeFuncionario = new String[qtdFuncionarios];
        String[] cpfFuncionario = new String[qtdFuncionarios];
        int[] idadeFuncionario = new int[qtdFuncionarios];

        int senha = 123;

        for (int i = 0; i < qtdFuncionarios; i++) {

            System.out.println("Qual o nome do funcionário de id " + (i + 1) + "?");
            nomeFuncionario[i] = entradatexto.nextLine();

            System.out.println("Qual o cpf do funcionário de id " + (i + 1) + "?");
            cpfFuncionario[i] = entradatexto.nextLine();

            System.out.println("Qual a idade do funcionário de id " + (i + 1) + "?");
            idadeFuncionario[i] = entradanumero.nextInt();
        }

        System.out.println("Quer consultar algum funcionário? [1] Para sim [2] Para não");
        int escolha = entradanumero.nextInt();

        if (escolha == 1) {

            for (int j = 3; j > 0; j--) {

                System.out.println("Digite a senha para a consulta");
                int senhaDigitada = entradanumero.nextInt();

                if (senhaDigitada == senha) {

                    System.out.println("Qual id deseja consultar?");
                    int idConsultado = entradanumero.nextInt() - 1;

                    System.out.println("Nome: " + nomeFuncionario[idConsultado]);
                    System.out.println("cpf: " + cpfFuncionario[idConsultado]);
                    System.out.println("idade: " + idadeFuncionario[idConsultado]);

                    break;

                } else {

                    System.out.println("Senha incorreta");
                    System.out.println("Você tem mais " + (j - 1) + " tentativas");
                }
            }

        } else if (escolha == 2) {
            System.out.println("O sistema acaba aqui");
        }
    }
}