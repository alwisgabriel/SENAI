package CRMexercicio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente cli = new Cliente();
        Integer resposta;
        do{
            System.out.println("Escolha uma das opções");
            System.out.println("[1] Para Cadastrar um cliente");
            System.out.println("[2] Para Atualizar um cliente");
            System.out.println("[3]Para remover um cliente");
            System.out.println("[99]Para sair do sistema");
            resposta = input.nextInt();


            switch (resposta) {
                case 1:
                    cli.cadastrar();
                    break;

                case 2: cli.atualizarCliente();
                break;

                case 3: cli.deletarClientes();

                case 99:
                    System.out.println("Saindo do sistema...");
                    break;

                    default:
                    System.out.println("Opção inválida!");

                case 4:
                  cli.consultarClientes();
                  break;
            }


        }while (resposta != 99);
    }
}
