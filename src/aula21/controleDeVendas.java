package aula21;

import java.util.ArrayList;
import java.util.Scanner;

public class controleDeVendas {
    public static void main(String[] args) {
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        ArrayList<String> nomeCliente = new ArrayList<String>();
        ArrayList<Integer> vendasCliente = new ArrayList<Integer>();



        ArrayList<String> nomeProduto = new ArrayList<String>();
        ArrayList<Integer> precoProduto = new ArrayList<Integer>();
        ArrayList<Integer> quantidade = new ArrayList<>(); // Quantidade do produto
        int produtoVendido = 0;
        int quantidadeVendida = 0;
        int quantidadeProduto = 0;
        int somaVenda = 0;
        int somaMes = 0;
        int resposta;
        int id = 0;
        int idProduto = 0;
        int idVenda = 0; // Id do cliente que realizou a venda
        do {
            System.out.println("[1] Para cadastrar o cliente");
            System.out.println("[2] Para cadastrar produto");
            System.out.println("[3] Para registrar as vendas no mês");
            System.out.println("[4] Para consultar cliente");
            System.out.println("[5] Relatorio geral");
            System.out.println("[0] Para sair");
            resposta = entradaTexto.nextInt();

            switch (resposta) {
                case 1:

                    System.out.println("id do vendedor");
                    System.out.println(id); // Printa o ID atual do produto, iniciando em 0

                    System.out.println("digite o nome do cliente");
                    nomeCliente.add(entradaTexto.nextLine());
                    entradaTexto.nextLine();

                    /*
                     * id = 0;
                     * nomeCliente[0] = Claudio
                     *
                     * */

                    id++;
                    break;

                case 2:


                    System.out.println("id do produto");
                    System.out.println(idProduto); // Printa o ID atual do produto, iniciando em 0

                    System.out.println("digite o nome do produto");
                    nomeProduto.add(entradaTexto.nextLine());
                    entradaTexto.nextLine();

                    System.out.println("digite o preço");
                    precoProduto.add(entradaNumero.nextInt());
                    // 0 = 5, 1 = 10

                    System.out.println("digite a quantidade");
                    quantidade.add(entradaNumero.nextInt());


                    System.out.println("Produto cadastrado");

                    idProduto++; // Adiciona 1 ID a cada produto cadastrado
                    // Exemplo: 5 produtos cadastrados = IDs 0, 1, 2, 3 e 4
                    break;

                case 3:
                    System.out.println("Qual o id vendedor?");
                    idVenda = entradaNumero.nextInt();

                    for (int j = 0; j <= 12; j++) {
                        System.out.println("Quantos  produtos o vendedor vendeu no mês?");
                        quantidadeProduto = entradaNumero.nextInt();

                        for (int i = 0; i < quantidadeProduto; i++) {
                            System.out.println("Qual o id do produto " + (i + 1));
                            produtoVendido = entradaNumero.nextInt();
                            //     int quantidadeAtual = quantidade.get(idVenda);
                            somaVenda = precoProduto.get(produtoVendido);

                            System.out.println("Qual a quantidade vendida desse produto?");
                            quantidadeVendida = entradaNumero.nextInt();
                            somaMes = somaVenda * quantidadeVendida;
                            System.out.printf("Total vendido no mes" + somaMes);

                            vendasCliente.add(somaMes);


                        }
                    }

            }

        } while (resposta != 0) ;
    }
}
