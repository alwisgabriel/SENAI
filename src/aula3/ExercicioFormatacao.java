package aula3;

public class ExercicioFormatacao {
        public static void main(String[] args) {
    String nome = "Uno";
    String marca = "Fiat";
    String placa = "JDX-7X81";
    int ano = 2013;
    double valor = 10.000;

            System.out.printf("Vendo %s %s 2013 com escada!", marca, nome);
            System.out.printf("\nUsado, fabricado em 2013. placa: %s.\n", placa);
            System.out.printf("Valor: %.3f", valor);

        }


}
