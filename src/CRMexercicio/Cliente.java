package CRMexercicio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//MVP CRM
public class Cliente {
    ArrayList<String> nmCliente = new ArrayList<String>();
    ArrayList<String> nuCpf = new ArrayList<String>();
    ArrayList<Integer> nuIdade = new ArrayList<Integer>();
    ArrayList<Double> vlSalario = new ArrayList<Double>();
    ArrayList<Date> dtCadastro = new ArrayList<Date>();
    ArrayList<String> flAtivo = new ArrayList<String>();
    Scanner inputText = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);
    Integer resposta;




    void cadastrar() {
        System.out.println("Iremos iniciar o cadastro...");
        System.out.println("Insira o seu nome:");
        nmCliente.add(inputText.nextLine());
        System.out.println("Insira o seu cpf:");
        nuCpf.add(inputText.nextLine());
        System.out.println("Insira sua idade:");
        nuIdade.add(inputNumber.nextInt());
        System.out.println("Insira seu salário");
        vlSalario.add(inputNumber.nextDouble());
        dtCadastro.add(new Date());
        flAtivo.add("s");


    };

    void atualizarCliente() {

        System.out.println("Iremos iniciar a atualização do cadastro...");
        System.out.println("Qual cliente você deseja atualizar");
        resposta = inputNumber.nextInt();
        System.out.println("Insira o seu nome a ser atualizado:");
        nmCliente.set(this.resposta,inputText.nextLine());
        System.out.println("Insira o seu cpf a ser atualizado:");
        nuCpf.set(this.resposta,inputText.nextLine());
        System.out.println("Insira sua idade a ser atualizada:");
        nuIdade.set(this.resposta,inputNumber.nextInt());
        System.out.println("Insira seu salário a ser atualizado");
        vlSalario.set(this.resposta,inputNumber.nextDouble());
        flAtivo.set(this.resposta,inputText.nextLine());

    };
    void deletarClientes(){
        System.out.println("Qual cliente deseja excluir?");
        resposta = inputNumber.nextInt();


        resposta = inputNumber.nextInt();

        nmCliente.remove(resposta);
        nuCpf.remove(resposta);
        nuIdade.remove(resposta);
        vlSalario.remove(resposta);
        flAtivo.remove(resposta);
        System.out.println("Clientes excluidos com sucesso!");
    };

    void consultarClientes() {
        System.out.println("Qual cliente deseja consultar?");
        resposta = inputNumber.nextInt();

        System.out.println (nmCliente.get(resposta));
        System.out.println (nuCpf.get(resposta));
        System.out.println (nuIdade.get(resposta));
        System.out.println (vlSalario.get(resposta));
    }

}
