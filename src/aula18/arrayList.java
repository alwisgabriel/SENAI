package aula18;

import java.util.ArrayList;

public class arrayList {
    public static void main (String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("Sorocaba");
        cidades.add("Xique-Xique");
        cidades.add("Tubarão");
        cidades.add(0, "São paulo");
        System.out.println(cidades);
    }
}
