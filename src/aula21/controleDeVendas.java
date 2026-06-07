package aula21;

import java.util.ArrayList;
import java.util.Scanner;

public class controleDeVendas {

    public static void main(String[] args) {

        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);

        ArrayList<String> nomeCliente = new ArrayList<>();
        int[][] vendasCliente = new int[100][12]; // 100 clientes e 12 meses
        ArrayList<String> nomeProduto = new ArrayList<>();
        ArrayList<Integer> precoProduto = new ArrayList<>();
        ArrayList<Integer> quantidade = new ArrayList<>();

        int produtoVendido;
        int quantidadeVendida;
        int quantidadeProduto;
        int somaVenda;
        int somaMes;
        int resposta;
        int id = 0;
        int idProduto = 0;
        int idVenda;

        do {

            System.out.println("[1] Para cadastrar o cliente");
            System.out.println("[2] Para cadastrar produto");
            System.out.println("[3] Para registrar as vendas no mês");
            System.out.println("[4] Para consultar cliente");
            System.out.println("[5] Relatorio geral");
            System.out.println("[0] Para sair");

            resposta = entradaNumero.nextInt();

            switch (resposta) {

                case 1:

                    System.out.println("id do vendedor");
                    System.out.println(id);
                    entradaTexto.nextLine();

                    System.out.println("Digite o nome do cliente");
                    nomeCliente.add(entradaTexto.nextLine());

                    id++;
                    break;

                case 2:

                    System.out.println("id do produto");
                    System.out.println(idProduto);
                    entradaTexto.nextLine();

                    System.out.println("Digite o nome do produto");
                    nomeProduto.add(entradaTexto.nextLine());

                    System.out.println("Digite o preço");
                    precoProduto.add(entradaNumero.nextInt());

                    System.out.println("Digite a quantidade");
                    quantidade.add(entradaNumero.nextInt());

                    System.out.println("Produto cadastrado");

                    idProduto++;
                    break;

                case 3:

                    System.out.println("Qual o id vendedor?");
                    idVenda = entradaNumero.nextInt();

                    for (int j = 0; j < 12; j++) {

                        System.out.println("\nMês " + (j + 1));
                        System.out.println("Quantos produtos o vendedor vendeu no mês?");
                        quantidadeProduto = entradaNumero.nextInt();

                        somaMes = 0;

                        for (int i = 0; i < quantidadeProduto; i++) {

                            System.out.println("Qual o id do produto " + (i + 1));
                            produtoVendido = entradaNumero.nextInt();

                            somaVenda = precoProduto.get(produtoVendido);

                            System.out.println("Qual a quantidade vendida desse produto?");
                            quantidadeVendida = entradaNumero.nextInt();

                            somaMes += somaVenda * quantidadeVendida;
                        }

                        vendasCliente[idVenda][j] = somaMes;

                        System.out.println("Total vendido no mês: " + somaMes);
                    }

                    break;

                case 4:

                    System.out.println("Digite o id do cliente");
                    int idConsulta = entradaNumero.nextInt();

                    int totalAno = 0;
                    System.out.println("Cliente: " + nomeCliente.get(idConsulta));

                    for (int mes = 0; mes < 12; mes++) {
                     int vendaMes = vendasCliente[idConsulta][mes];
                        System.out.println("Mês " + (mes + 1) + ": R$ " + vendaMes);

                        totalAno += vendaMes;
                    }

                    System.out.println("Total anual: R$ " + totalAno);

                    break;

                case 5:

                    int totalGeral = 0;

                    for (int cliente = 0; cliente < nomeCliente.size(); cliente++) {
                    int totalCliente = 0;

                    for (int mes = 0; mes < 12; mes++) {
                            totalCliente += vendasCliente[cliente][mes];
                    }

                        System.out.println(nomeCliente.get(cliente));
                        System.out.println("Total vendido: R$ " + totalCliente);

                        totalGeral += totalCliente;
                    }

                    System.out.println("Total geral vendido: R$ " + totalGeral);

                    break;

                case 0:
                    System.out.println("Programa encerrado");
                    break;
            }

        } while (resposta != 0);

    }
}

/*
 * Falta implementar para cumprir todos os requisitos do trabalho:
 *
 * - Média mensal de vendas de cada cliente.
 * - Mês de maior venda de cada cliente.
 * - Mês de menor venda de cada cliente.
 * - Maior venda registrada no sistema.
 * - Menor venda registrada no sistema.
 * - Cliente responsável pela maior venda.
 * - Cliente responsável pela menor venda.
 * - Consulta de cliente pelo nome.
 * - Relatório geral completo com todas as estatísticas exigidas.
 *
 * Desafios extras (opcionais):
 *
 * - Ranking dos 3 clientes com maior volume de vendas.
 * - Exibir meses com vendas acima da média.
 * - Alterar uma venda já cadastrada.
 * - Consultar os produtos mais vendidos.
 */
