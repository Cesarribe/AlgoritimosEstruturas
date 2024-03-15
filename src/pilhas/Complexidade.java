package pilhas;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Complexidade {

    public static void main(String[] args) {
        Pilha mainPilha = new Pilha();

        mainPilha.push(10);
        mainPilha.push(5);
        mainPilha.push(40);

        // Calcula a complexidade de tempo
        calcularComplexidadeTempo();

        // Calcula a complexidade de espaço
        calcularComplexidadeEspaco(mainPilha);
    }

    public static void calcularComplexidadeTempo() {
        System.out.println("Complexidade de Tempo:");
        System.out.println("- push(): O(1)");
        System.out.println("- pop(): O(1)");
        System.out.println("- top(): O(1)");
        System.out.println("- size(): O(1)");
        System.out.println("- isEmpty(): O(1)");
    }

    public static void calcularComplexidadeEspaco(Pilha pilha) {
        int tamanho = pilha.size();
        System.out.println("\nComplexidade de Espaço:");
        System.out.println("- O(n), onde n é o número de elementos na pilha: " + tamanho);
    }
}
