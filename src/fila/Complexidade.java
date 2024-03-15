package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Complexidade {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        int[] elements = {1, 2, 3, 4, 5};

        // Adiciona elementos à fila
        for (int element : elements) {
            fila.add(element);
        }

        // Calcula a complexidade de tempo
        calcularComplexidadeTempo();

        // Calcula a complexidade de espaço
        calcularComplexidadeEspaco(fila);
    }

    public static void calcularComplexidadeTempo() {
        System.out.println("Complexidade de Tempo:");
        System.out.println("- enqueue(): O(1)");
        System.out.println("- dequeue(): O(1)");
        System.out.println("- rear(): O(1)");
        System.out.println("- front(): O(1)");
        System.out.println("- size(): O(1)");
        System.out.println("- isEmpty(): O(1)");
    }

    public static void calcularComplexidadeEspaco(Queue<Integer> fila) {
        int tamanho = fila.size();
        System.out.println("\nComplexidade de Espaço:");
        System.out.println("- O(n), onde n é o número de elementos na fila: " + tamanho);
    }
}

