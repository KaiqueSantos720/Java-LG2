public class Main {
  public static void main(String[] args) {
    
    //Vetor de Object
    Vetor v1 = new Vetor(2);
    System.out.println(v1 + "\n");

    v1.adicionar("Oi");
    v1.adicionar("Mundo");
    System.out.println(v1 + "\n");

    v1.adicionar("Salve");
    v1.adicionar(2.0);
    System.out.println(v1 + "\n");

    String palavra = (String) v1.buscar(0);
    System.out.println(palavra + "\n");



    Vetor v2 = new Vetor(2);

    v2.adicionar(10);
    v2.adicionar(20);
    System.out.println(v2 + "\n");


    System.out.println("\n\n\n");    


    //Programação Genérica
    VetorGenerico<String> vg1 = new VetorGenerico<>(2);

    vg1.adicionar("Chelsea");
    vg1.adicionar("Real Madrid");
    System.out.println(vg1 + "\n");

    vg1.adicionar("Bayern");   
    System.out.println(vg1 + "\n");

    System.out.println(vg1.contem("Chelsea") + "\n");
    System.out.println(vg1.contem("Liverpool") + "\n");

    VetorGenerico<Integer> vg2 = new VetorGenerico<>(5);

    vg2.adicionar(3);
    vg2.adicionar(19);
    vg2.adicionar(25);
    System.out.println(vg2 + "\n");

    vg2.remover(0);
    System.out.println(vg2 + "\n");

    Integer numero = vg2.buscar(1);
    System.out.println(numero + "\n");

    System.out.println(vg2.contem(20) + "\n");





  }
}