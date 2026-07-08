package aula21;

import java.util.ArrayList;
import java.util.Scanner;

public class controleDeVendas {

    public static void main(String[] args) {

        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);

        ArrayList<String> nomeCliente = new ArrayList<>();
<<<<<<< HEAD
=======
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
>>>>>>> 1e161b889091f566e0e8767c88be5a3a7c03a980
        int id = 0;



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

        int idProduto = 0;
        int idVenda;
        int mediaMensual = 0;
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
<<<<<<< HEAD

                            somaMes += somaVenda * quantidadeVendida;
=======

                            somaMes += somaVenda * quantidadeVendida;
                        }

                        vendasCliente[idVenda][j] = somaMes;

                        System.out.println("Total vendido no mês: " + somaMes);

                    }

                    break;

                case 4:
                    System.out.println("Digite o nome do cliente");
                    String nomeConsulta = entradaTexto.nextLine().trim();

                    int idEncontrado = -1;
                    for (int i = 0; i < nomeCliente.size(); i++) {
                        if (nomeCliente.get(i).equalsIgnoreCase(nomeConsulta)) { // Ignora maiúsculo e minúsculo
                            idEncontrado = i;
                            break;
>>>>>>> 1e161b889091f566e0e8767c88be5a3a7c03a980
                        }

                        vendasCliente[idVenda][j] = somaMes;

                        System.out.println("Total vendido no mês: " + somaMes);

                    }

<<<<<<< HEAD
                    break;

                case 4:
                    System.out.print("Digite o ID do cliente: ");
                    int idCliente = entradaNumero.nextInt();

                    if (idCliente < 0 || idCliente >= nomeCliente.size()) {
                        System.out.println("Cliente não encontrado!");
                        break;
                    }

                    System.out.println("Cliente: " + nomeCliente.get(idCliente));

                    int totalAno = 0;

                    for (int mes = 0; mes < 12; mes++) {
                        int vendaMes = vendasCliente[idCliente][mes];
=======
                    if (idEncontrado == -1) {
                        System.out.println("Cliente não encontrado: " + nomeConsulta);
                        break;
                    }


                    System.out.println("Cliente: " + nomeCliente.get(idEncontrado));
                    int totalAno = 0;
                    for (int mes = 0; mes < 12; mes++) {
                        int vendaMes = vendasCliente[idEncontrado][mes];
>>>>>>> 1e161b889091f566e0e8767c88be5a3a7c03a980
                        System.out.println("Mês " + (mes + 1) + ": R$ " + vendaMes);
                        totalAno += vendaMes;
                    }

<<<<<<< HEAD
                    int mediaMensal = totalAno / 12;

=======
                    for (int cliente = 0; cliente < nomeCliente.size(); cliente++) {

                        for (int mes = 0; mes < 12; mes++) {

                        }

                        System.out.println(); // Quebra de linha após cada linha da matriz
                    }


                    int mediaMensal = totalAno / 12; // inteiro; se quiser decimal, use double
>>>>>>> 1e161b889091f566e0e8767c88be5a3a7c03a980
                    System.out.println("Total anual: R$ " + totalAno);
                    System.out.println("Média mensal: R$ " + mediaMensal);
                    break;



                case 5:

                    int totalGeral = 0;

                    // Começa assumindo que a primeira venda da matriz é a maior e a menor
                    int maiorVendaSistema = vendasCliente[0][0];
                    int menorVendaSistema = vendasCliente[0][0];

                    String clienteMaiorVenda = nomeCliente.get(0);
                    String clienteMenorVenda = nomeCliente.get(0);


                    for (int cliente = 0; cliente < nomeCliente.size(); cliente++) {

                        int totalCliente = 0;

                        // Começa assumindo que a primeira venda do cliente é a maior e a menor
                        int maiorVendaCliente = vendasCliente[cliente][0];
                        int menorVendaCliente = vendasCliente[cliente][0];


                        int mesMaior = 1;
                        int mesMenor = 1;


                        for (int mes = 0; mes < 12; mes++) {

                            totalCliente += vendasCliente[cliente][mes];


                            if (vendasCliente[cliente][mes] > maiorVendaCliente) {
                                maiorVendaCliente = vendasCliente[cliente][mes];
                                mesMaior = mes + 1; // +1 porque janeiro é mês 1
                            }


                            if (vendasCliente[cliente][mes] < menorVendaCliente) {
                                menorVendaCliente = vendasCliente[cliente][mes];
                                mesMenor = mes + 1;
                            }


                            if (vendasCliente[cliente][mes] > maiorVendaSistema) {
                                maiorVendaSistema = vendasCliente[cliente][mes];
                                clienteMaiorVenda = nomeCliente.get(cliente);
                            }


                            if (vendasCliente[cliente][mes] < menorVendaSistema) {
                                menorVendaSistema = vendasCliente[cliente][mes];
                                clienteMenorVenda = nomeCliente.get(cliente);
                            }
                        }

                        System.out.println("\nCliente: " + nomeCliente.get(cliente));
                        System.out.println("Total vendido: R$ " + totalCliente);
                        System.out.println("Maior venda: R$ " + maiorVendaCliente + " (Mês " + mesMaior + ")");
                        System.out.println("Menor venda: R$ " + menorVendaCliente + " (Mês " + mesMenor + ")");

                        totalGeral += totalCliente;
                    }


                    System.out.println("Total geral vendido: R$ " + totalGeral);

                    System.out.println("Maior venda registrada: R$ " + maiorVendaSistema);
                    System.out.println("Cliente responsável: " + clienteMaiorVenda);

                    System.out.println("Menor venda registrada: R$ " + menorVendaSistema);
                    System.out.println("Cliente responsável: " + clienteMenorVenda);

                    break;

                case 0:
                    System.out.println("Programa encerrado");
                    break;
            }

        } while (resposta != 0);

    }
}

