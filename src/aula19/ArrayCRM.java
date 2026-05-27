package aula19;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCRM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputNumero = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> cpf = new ArrayList<>();
        ArrayList<Integer> idade = new ArrayList<>();
        ArrayList<Double> salario = new ArrayList<Double>();
        int resposta;
        int id = 0;
        int idEscolhido;
        Double salarioIdEscolhido;
        System.out.println("Bem vindo ao sistema");

        do {
            System.out.println("[1] Para cadastrar um novo cliente");
            System.out.println("[2] Para consultar um cliente");
            System.out.println("[3] Para realizar um empréstimo");
            System.out.println("[4] Limpar dados de todos os clientes");
            System.out.println("[5] Alterar dados dos clientes");
            System.out.println("[9] Para verificar a versão do sistema");
            resposta = inputNumero.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("O Id do cadastro deste cliente é");
                    System.out.println(id);


                    System.out.println("Digite o nome do cliente");
                    nomes.add(input.nextLine());

                    System.out.println("Digite o cpf do cliente");
                    cpf.add(input.nextLine());

                    System.out.println("Digite a idade do cliente");
                    idade.add(inputNumero.nextInt());

                    System.out.println("Digite o salário do cliente");
                    salario.add(inputNumero.nextDouble());

                    id++;
                    break;

                case 2:
                    System.out.println("Para consultar digite o id do cadastro desejado");

                    int consulta = inputNumero.nextInt();

                    System.out.printf("Nome do cliente: %s\n", nomes.get(consulta));
                    System.out.printf("Cpf do cliente: %s\n", cpf.get(consulta));
                    System.out.printf("Idade do cliente: %d\n", idade.get(consulta));
                    System.out.printf("Salário do cliente: %.2f \n\n\n\n", salario.get(consulta));

                    break;

                case 3:


                    System.out.println("Qual o id do cliente?");
                    idEscolhido = inputNumero.nextInt();

                    salarioIdEscolhido = salario.get(idEscolhido);

                    System.out.println("Qual o valor do empréstimo?");
                    double valorEmprestimo = input.nextDouble();
                    double limite = salarioIdEscolhido * 0.10;

                    if (valorEmprestimo <= limite) {

                        System.out.println("Escolha as parcelas:");
                        System.out.println("[1] 24x");
                        System.out.println("[2] 36x");
                        System.out.println("[3] 48x");

                        int escolhaParcela = inputNumero.nextInt();

                        int parcelas = 0;

                        switch (escolhaParcela) {
                            case 1:
                                parcelas = 24;
                                break;

                            case 2:
                                parcelas = 36;
                                break;

                            case 3:
                                parcelas = 48;
                                break;

                            default:
                                System.out.println("Opção inválida");
                                break;
                        }

                        if (parcelas > 0) {

                            double juros = 1.8 / 100.0;
                            double valorTotal = valorEmprestimo + (valorEmprestimo * juros * parcelas);
                            double valorParcela = valorTotal / parcelas;

                            System.out.println("Empréstimo aprovado");
                            System.out.println("valor total " + valorTotal);
                            System.out.println("Valor da parcela: " + valorParcela);

                            if (valorTotal <= limite) {
                                System.out.println("Empréstimo aprovado");
                            } else {
                                System.out.println("reprovado");
                            }
                        }

                    } else {
                        System.out.println("Empréstimo não aprovado");
                    }

                    break;

                case 5:
                    System.out.println("Qual o id do cliente que você deseja alterar dados?");
                    int idAlterar = inputNumero.nextInt();

                    System.out.println("Qual o novo nome? (Se não mudar, coloque o mesmo)");
                    String nomeNovo = input.nextLine();
                    nomes.set(idAlterar, nomeNovo);

                    System.out.println("Qual o novo cpf? (Se não mudar, coloque o mesmo");
                    String cpfNovo = input.nextLine();

                    cpf.set(idAlterar, cpfNovo);

                    System.out.println("Qual o nova idade? (Se não mudar, coloque o mesmo");
                    int idadeNovo = inputNumero.nextInt();

                    idade.set(idAlterar, idadeNovo);
                    break;

                case 4:

                    System.out.println("Você deseja remover todos os dados de todos os clientes? [1] Sim [2] Não");
                    int removerEscolha = inputNumero.nextInt();
                    switch (removerEscolha) {
                        case 1: nomes.clear();
                        cpf.clear();
                        salario.clear();
                        idade.clear();

                        id = 0;
                        System.out.println("Todos os dados foram limpados");
                        break;

                        case 2:
                        break;

                        default:
                            System.out.println("Digite outra opção");
                        break;




                    }


                    break;
            }

        } while (resposta != 0);

    }
}