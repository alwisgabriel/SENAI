package aula20;

import java.util.ArrayList;
import java.util.Scanner;

public class controleEstoque {
    public static void main(String[] args){

    // ArrayList<String> variavel = new ArrayList<>();

    // 1. Criar um menu do-while com switch com os cases:

    // Case 1: Adicionar ou repor
    // Case 2: Venda
    // Case 3: Consultar estoque

    // 2. Condicionais

    // Se chegar a 0 o item pode ser removido da lista

    // 3. Cálculo de valor total
    // Printar valores somados

    ArrayList<String> nome = new ArrayList<>();
    ArrayList<Double> preco = new ArrayList<>();
    ArrayList<Integer> quantidade = new ArrayList<>();
    int id = -1;
    int escolhaMenu = 0;
    int escolhaRepor = 0;
    int idRepor = 0;
    int quantidadeRepor;

        Scanner input = new Scanner(System.in);
        Scanner inputNumero = new Scanner(System.in);

    do {

        System.out.println("Digite [1] para adicionar/repor produtos");
        System.out.println("Digite [2] para vender o produto"); // N ESQUECE DE DIMINUIR A QUANTIDADE CARALHO
        switch (escolhaMenu){
            case 1:

                if (id < -1){
                System.out.println("O Id do cadastro deste produto é");
                System.out.println(id);


                System.out.println("Digite o nome do produto");
                nome.add(input.nextLine());

                System.out.println("Digite o preço do produto");
                preco.add(input.nextDouble());

                System.out.println("Digite a quantidade de produtos");
                quantidade.add(inputNumero.nextInt());
                id++;
                }

                else if (id > -1) {

                    System.out.println("Você deseja repor ou adicionar itens? [1] Repor [2] Adicionar");
                    escolhaMenu = inputNumero.nextInt();
                    switch (escolhaMenu) {
                        case 1:
                            System.out.println("Qual o id do produto que você deseja repor a quantidade?");
                            if (idRepor)
//                            idRepor = inputNumero.nextInt();

                            System.out.println("Quantas unidades deseja ter nesse produto?");
                            quantidadeRepor = inputNumero.nextInt();
                            quantidade.set(idRepor, quantidadeRepor);



                    }
                }



        }
    } while (escolhaMenu != 0);

    }





}
