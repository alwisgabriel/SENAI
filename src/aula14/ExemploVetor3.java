package aula14;

public class ExemploVetor3 {
    public static void main(String[] args) {
        String [] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int [] diasMes = {31, 28, 2, 6, 23, 6, 8, 34, 2, 7, 4, 21};
        int i;
        for (i = 0; i<mes.length; i++) {
            System.out.printf("%s, tem %d dias. \n", mes[i], diasMes[1]);
        }
    }
}
