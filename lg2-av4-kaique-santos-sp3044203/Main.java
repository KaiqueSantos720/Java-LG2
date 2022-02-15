public class Main {
  public static void main(String[] args) {
    
    //Pilha
    System.out.println("Pilha\n");
    ListaPilha<String> p1 = new ListaPilha<String>();

    p1.empilha("Bayern");
    p1.empilha("Chelsea");
    p1.empilha("Real Madrid");
    System.out.println("O tamanho da pilha é: " + p1.tamanho());
    System.out.println("Elemento desempilhado: " + p1.desempilha());
    System.out.println("\n");

    System.out.println("O topo da pilha é: " + p1.topo());
    System.out.println("O tamanho da pilha é: " + p1.tamanho());
    System.out.println("\n");

    p1.empilha("Liverpool");
    p1.empilha("Milan");
    System.out.println("Elemento desempilhado: " + p1.desempilha());
    System.out.println("A lista está vazia? " + p1.vazia());
    System.out.println("O topo da pilha é: " + p1.topo());
    System.out.println("O tamanho da pilha é: " + p1.tamanho());

    System.out.println("\n\n\n");

    //Fila
    System.out.println("Fila\n");
    ListaFila<String> f1 = new ListaFila<String>();
    
    f1.enfileirar("Maria");
    f1.enfileirar("José");
    f1.enfileirar("Rodrigo");
    f1.enfileirar("Caio");
    f1.enfileirar("André");
    System.out.println("O tamanho da fila é: " + f1.tamanho());
    System.out.println("\n");

    System.out.println("Elemento desenfileirado: " + f1.desenfileirar());
    System.out.println("Elemento desenfileirado: " + f1.desenfileirar());
    System.out.println("O primeiro da fila é: " + f1.primeiro());
    System.out.println("O tamanho da fila é: " + f1.tamanho());
    System.out.println("\n");

    f1.enfileirar("Matheus");
    System.out.println("A lista está vazia? " + f1.vazia());
    System.out.println("Elemento desenfileirado: " + f1.desenfileirar());
    System.out.println("O primeiro da fila é: " + f1.primeiro());
    System.out.println("O tamanho da fila é: " + f1.tamanho());




  }
}