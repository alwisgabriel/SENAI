package Aula7;

public class lacorepeticao {
    public static void main(String[] args) {
        for (int i = 3; i > 0; i--) {
            System.out.printf("Contagem regressiva em %d\n", i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Já");
    }
}