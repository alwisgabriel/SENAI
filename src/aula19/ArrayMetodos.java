package aula19;

import java.util.ArrayList;

public class ArrayMetodos {
    public static void main (String[] args) {
    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("Marcos");
    nomes.add("Maria");
    nomes.add("Tadeu");

        System.out.println(nomes);
        System.out.println(nomes.get(1));
        nomes.set(1, "Juliana");
        System.out.println(nomes);
        //nomes.clear();
        System.out.println(nomes);
    }
}
