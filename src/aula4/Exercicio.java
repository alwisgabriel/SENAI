/* * Crie 3 condições, onde elas irão fazer as seguintes validações:
 * 1' Maria tem mais de 18 anos, se for igual sim,
 * então Maria poderá entrar na festa.
 * 2' Tadeu tem mais de 16 anos, se for igual sim,
 * então Tadeu não poderá trabalhar como menor aprendiz.
 * 3' Se o carro custar mais de 100mil reais,
 * então Marcos não poderá comprar o carro no momento.
 */

package aula4;

public class Exercicio {
    public static void main(String[] args) {

        int idadeMaria = 18;
        int idadeTadeu = 16;
        double precoCarro = 100000.00, saldoMarcos = 100000;


        if (idadeMaria > 18) {
            System.out.println("Maria pode entrar na festa.");
        } else if (idadeMaria == 18) {
            System.out.println("Maria tem 18 anos exatos.");
        } else {
            System.out.println("Maria é menor de idade e não pode entrar.");
        }

        if (idadeTadeu > 16) {
            System.out.println("Tadeu não poderá trabalhar como menor aprendiz.");
        } else if (idadeTadeu >= 14 && idadeTadeu <= 16) {
            System.out.println("Tadeu tem a idade certa para ser menor aprendiz.");
        } else {
            System.out.println("Tadeu é muito novo para trabalhar.");
        }

        if (precoCarro > saldoMarcos) {
            System.out.println("Marcos não pode comprar o carro no momento.");
        } else if (precoCarro == saldoMarcos) {
            System.out.println("O carro custa exatamente 100mil.");
        } else {
            System.out.println("O carro custa menos de 100mil. Marcos pode roncar de carrão novo");
        }
    }
}