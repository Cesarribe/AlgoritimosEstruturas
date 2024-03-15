import Encadeadas.ListaEncadeada;
import Encadeadas.Node;

public static void main(String[] args) {

    ListaEncadeada lista = new ListaEncadeada();

    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);

    lista.push(node1);
    lista.push(node2);
    lista.push(node3);

    System.out.println("Lista Encadeada: ");
    lista.printList();

    System.out.println("Removendo o último elemento:");
    Node removedNode = lista.pop();
    System.out.println("Elemento removido: " + removedNode.data);

    System.out.println("Inserindo um novo elemento no índice 1:");
    Node newNode = new Node(4);
    lista.insert(1, newNode);

    System.out.println("Lista após a inserção:");
    lista.printList();

    System.out.println("Removendo o elemento no índice 1:");
    lista.remove(1);

    System.out.println("Lista após a remoção:");
    lista.printList();

    // Calcular complexidade de tempo e espaço
    lista.calcularComplexidade();
}

