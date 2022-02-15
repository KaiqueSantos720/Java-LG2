public class Main {
  public static void main(String[] args) {
    
    Vetor v1 = new Vetor(5);

    System.out.println("Vetor de Strings\n");

    v1.adicionar("Chelsea");
    v1.adicionar("Borussia Dortmund");
    v1.adicionar("Liverpool");
    v1.adicionar("Bayern de Munique");
    v1.adicionar("Manchester United");
    System.out.println(v1.toString());
    System.out.println("\n");

    v1.adicionar(2, "Juventus");
    v1.adicionar(4, "Leipzig");
    System.out.println(v1.toString());
    System.out.println("\n");

    System.out.println("O tamanho é: " + v1.tamanho());
    v1.remover(2);
    System.out.println(v1.toString());
    System.out.println("\n");

    System.out.println("Time encontrado nessa posição: " + v1.buscar(4));
    System.out.println("Time encontrado na posição: " + v1.buscar("Liverpool"));
    System.out.println("\n");

    System.out.println("O tamanho é: " + v1.tamanho());



    System.out.println("\n----------------------------------------------\n");
    


    VetorInt vi1 = new VetorInt(2);

    System.out.println("Vetor de Inteiros\n");

    vi1.adicionar(10);
    vi1.adicionar(14);
    vi1.adicionar(44);
    vi1.adicionar(24);
    System.out.println(vi1.toString());
    System.out.println("\n");

    vi1.adicionar(0, 120);
    vi1.adicionar(3, 800);
    System.out.println(vi1.toString());
    System.out.println("\n");

    System.out.println("O tamanho é: " + vi1.tamanho());
    vi1.remover(4);
    System.out.println(vi1.toString());
    System.out.println("\n");

    System.out.println("Número encontrado nessa posição: " + vi1.buscarPosicao(4));
    System.out.println("Número encontrado na posição: " + vi1.buscarElemento(800));
    System.out.println("\n");

    System.out.println("O tamanho é: " + vi1.tamanho());


  }
}