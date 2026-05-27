package aula2;

public class ExercicioOperadores {
    static void main(String[] args) {
        /*
        Crie as variaveis nome, cor, raça de um cachorro
        depois crie uma condição verificando se o cachorro tem mais de anos para poder
        tomar a vacinha, se tiver, pode tomar a vacina, se não, nao pode


         */

        String nome = "Pitoco";
        String cor = "marrom";
        String raca = "Pitbull";
        int idade = 1;

        System.out.println("O cachorro " + nome + " da raça " + raca + " da cor " + cor + " possui " + idade +" ano de idade");
        System.out.println(nome + " pode tomar vacina?");
        String resultado = idade>=2? "Sim" : "Não";
        System.out.println(resultado);
    }
        }
