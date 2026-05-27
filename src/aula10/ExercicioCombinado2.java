package aula10;

import java.util.Scanner;

public class ExercicioCombinado2{

    public static void main(String[] args) {

        Scanner inputTexto = new Scanner(System.in);
        Scanner inputNumero = new Scanner(System.in);

        String nome, cpf;
        double salario, valorFinanciar;
        int idade, filhos;
        String estadoCivil;
        int resposta;

        System.out.println("Bem-vindo ao sistema!");

        do {

            System.out.println("\nPreencha os seus dados abaixo");

            System.out.println("Digite o seu nome:");
            nome = inputTexto.nextLine();

            System.out.println("Digite o seu CPF:");
            cpf = inputTexto.nextLine();

            System.out.println("Digite o seu salário:");
            salario = inputNumero.nextDouble();

            System.out.println("Digite o valor a ser financiado:");
            valorFinanciar = inputNumero.nextDouble();

            System.out.println("Digite a sua idade:");
            idade = inputNumero.nextInt();

            System.out.println("Digite a quantidade de filhos:");
            filhos = inputNumero.nextInt();

            if (filhos > 0) {
                double descontoFilho = filhos *= 480;
                salario -= descontoFilho;

            }

            System.out.println(salario);



            System.out.println("Digite o seu estado civil:");
            estadoCivil = inputTexto.nextLine();
            estadoCivil = estadoCivil.toUpperCase();



            System.out.println(
                    "\nPara prosseguirmos:\n" +
                            "[1] Para cadastrar seus dados\n" +
                            "[2] Para solicitar um financiamento\n" +
                            "[3] Para alterar os dados cadastrais\n" +
                            "[4] Para verificar a versão do sistema\n" +
                            "[0] Para sair do sistema\n"
            );

            resposta = inputNumero.nextInt();

            switch (resposta) {

                case 1:

                    System.out.printf("Seu nome: %s\n", nome);
                    System.out.printf("Seu CPF: %s\n", cpf);
                    System.out.printf("Seu salário é: %.2f\n", salario);
                    System.out.printf("O valor a financiar é: %.2f\n", valorFinanciar);
                    System.out.printf("Sua idade é: %d\n", idade);
                    System.out.printf("A quantidade de filhos que você tem é: %d\n", filhos);
                    System.out.printf("Seu estado civil é: %s\n", estadoCivil);

                    break;

                case 2:

                    System.out.println("O valor solicitado para o financianamento foi:");
                    System.out.println(valorFinanciar);


                    if ((valorFinanciar/60) <= salario + 0.3) {

                    } else {
                        System.err.println("Salario incompátivel com o financiamento");
                    }

                    int sistemaDePontos = 0;


                    if (salario > valorFinanciar / 60) {
                        sistemaDePontos += 10;

                    }

                    if (valorFinanciar > salario * 10) {
                        sistemaDePontos -= 10;


                    } else {
                        sistemaDePontos += 30;

                    }

                    if (idade > 20) {
                        sistemaDePontos += 5;


                        if (idade > 30) {
                            sistemaDePontos += 5;

                        }

                    } if (idade == 18) {
                    sistemaDePontos += 1;

                } else if (idade < 18) {
                    System.out.println("Negado");
                    break ;
                }





                    if (estadoCivil.equals("casado")) {
                        sistemaDePontos += 20;
                    } else if (estadoCivil.equals("solteiro")) {
                        sistemaDePontos += 10;
                    }

                    if (estadoCivil.equals("divorciado")) {
                        sistemaDePontos -= 10;
                    }


                    int dividas;


                   do {

                       System.out.println("Você possui divídas? [1] Sim [2] Não [0] Cancelar");
                       dividas = inputNumero.nextInt();
                       switch (dividas) {
                           case 1:
                               sistemaDePontos -= 20;
                               System.out.println("Diminui 20 pontos");
                               break;

                           case 2:
                               sistemaDePontos += 20;
                               System.out.println("Aumenta 20");
                               break;

                           case 0:

                               break;
                           default:
                               System.err.println("Erro! Digite um número entre 1 e 2.");
                       }


                   }  while (dividas != 0);


                    System.out.println("Você possui " + sistemaDePontos + " pontos");
                    if (sistemaDePontos >= 70) {
                        System.out.println("Financiamento aprovado");
                    } else {
                        System.out.println("Não foi aprovado");
                        break;
                    }

                    break;

                case 3:

                    System.out.println("Alteração de dados cadastrais.");

                    System.out.println("\nPreencha os seus dados abaixo");

                    System.out.println("Digite o nome a ser alterado:");
                    nome = inputTexto.nextLine();

                    System.out.println("Digite o seu CPF alterado:");
                    cpf = inputTexto.nextLine();

                    System.out.println("Digite o seu salário alterado:");
                    salario = inputNumero.nextDouble();

                    System.out.println("Digite o valor a ser financiado alterado:");
                    valorFinanciar = inputNumero.nextDouble();

                    System.out.println("Digite a sua idade alterada:");
                    idade = inputNumero.nextInt();

                    System.out.println("Digite a quantidade de filhos a ser alterada:");
                    filhos = inputNumero.nextInt();

                    inputTexto.nextLine(); // limpa buffer

                    System.out.println("Digite o seu estado civil a ser alterado" +
                            ":");
                    estadoCivil = inputTexto.nextLine();
                    break;

                case 4:

                    System.out.println("Versão do sistema: 1.0");

                    break;

                case 0:

                    System.out.println("Saindo do sistema...");

                    break;

                default:

                    System.err.println("Erro! Digite um número entre 0 e 4.");
            }

        } while (resposta != 0);

        inputTexto.close();
        inputNumero.close();
    }
}