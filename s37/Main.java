class Main {
  public static void main(String[] args) {

    // Lista Encadeada

    ListaEncadeada<String> le1 = new ListaEncadeada<String>();

    System.out.println("\nA lista está vazia? " + le1.vazia());
    System.out.println("\n");

    le1.adicionarInicio("Juventus");
    le1.adicionarInicio("Bayern");
    le1.adicionarFim("Liverpool");
    le1.adicionarFim("Ajax");
    le1.adicionarInicio("Chelsea");
    le1.imprimir();
    System.out.println("\n");

    System.out.println("Tamanho da lista: " + le1.tamanho());
    System.out.println("Elemento encontrado nesta posição: " + le1.buscar(2));
    System.out.println("\n");

    le1.adicionar(0, "Real Madrid");
    le1.adicionar(3, "Benfica");
    le1.imprimir();
    System.out.println("\n");

    System.out.println("Elemento encontrado nesta posição: " + le1.buscar(5));
    System.out.println("\n");

    le1.removerInicio();
    le1.removerFim();
    le1.imprimir();
    System.out.println("\n");

    System.out.println("A lista está vazia? " + le1.vazia());
    System.out.println("Tamanho da lista: " + le1.tamanho());
    System.out.println("Primeiro elemento: " + le1.primeiro());
    System.out.println("Último elemento: " + le1.ultimo());

    System.out.println("\n\n----------------------------------\n\n");

    // Lista Duplamente Encadeada

    ListaDuplamenteEncadeada<Integer> lde1 = new ListaDuplamenteEncadeada<Integer>();

    lde1.adicionarFim(6);
    lde1.adicionarFim(9);
    lde1.adicionarFim(25);
    lde1.adicionarFim(10);
    lde1.imprimir();
    System.out.println("\n");
    
    System.out.println("Tamanho da lista: " + lde1.tamanho());
    System.out.println("Elemento encontrado nesta posição: " + lde1.buscar(0));
    System.out.println("\n");

    lde1.adicionar(0, 7);
    lde1.adicionar(2, 8);
    lde1.imprimir();
    System.out.println("\n");

    lde1.adicionarInicio(42);
    lde1.removerInicio();
    lde1.removerFim();
    lde1.imprimir();
    System.out.println("\n");
    
    System.out.println("\nA lista está vazia? " + lde1.vazia());
    System.out.println("Elemento encontrado nesta posição: " + lde1.buscar(2));
    System.out.println("Tamanho da lista: " + lde1.tamanho());
    System.out.println("Primeiro elemento: " + lde1.primeiro());
    System.out.println("Último elemento: " + lde1.ultimo());

  }
}