package Encadeadas;

public class ListaEncadeada {

    private Node head;

    public ListaEncadeada() {
        this.head = null;
    }

    // Adiciona um nó ao fim da lista
    public void push(Node node) {
        if (head == null) {
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
    }


    public Node pop() {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            Node removeNode = head;
            head = null;
            return removeNode;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        Node removedNode = secondLast.next;
        secondLast.next = null;

        return removedNode;
    }

    // Adiciona um nó na posição indicada
    public void insert(int index, Node node) {
        if (index < 0) {
            System.out.println("Índice inválido para inserção! ");
            return;
        }
        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Índice inválido para inserção.");
            return;
        }
        node.next = current.next;
        current.next = node;
    }


    public void remove(int index) {
        if (index < 0) {
            System.out.println("Índice inválido para remoção.");
            return;
        }
        if (index == 0 && head != null) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Índice inválido para remoção.");
            return;
        }

        current.next = current.next.next;
    }

    public Node elementAt(int index) {
        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        return current;
    }


    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Método para calcular a complexidade de tempo e espaço
    public void calcularComplexidade() {
        System.out.println("Complexidade de tempo e espaço:");

        System.out.println("push(Node node):");
        System.out.println("Tempo: O(n)");
        System.out.println("Espaço: O(1)");

        System.out.println("pop():");
        System.out.println("Tempo: O(n)");
        System.out.println("Espaço: O(1)");

        System.out.println("insert(int index, Node node):");
        System.out.println("Tempo: O(n)");
        System.out.println("Espaço: O(1)");

        System.out.println("remove(int index):");
        System.out.println("Tempo: O(n)");
        System.out.println("Espaço: O(1)");

        System.out.println("elementAt(int index):");
        System.out.println("Tempo: O(n)");
        System.out.println("Espaço: O(1)");

        System.out.println("size():");
        System.out.println("Tempo: O(n)");
        System.out.println("Espaço: O(1)");

        System.out.println("printList():");
        System.out.println("Tempo: O(n)");
        System.out.println("Espaço: O(1)");
    }
}
