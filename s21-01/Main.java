public class Main {
  public static void main(String[] args) {
    Carga c1 = new Carga(1, 200.00);
    Carga c2 = new Carga(2, 500.00);
    Carga c3 = new Carga(3, 1000.00);
    Carga c4 = new Carga(4, 100.00);

    Aviao a1 = new Aviao (1, 2000.00);
    Aviao a2 = new Aviao (2, 600.00);

    a1.adicionarCarga(c4);
    a1.adicionarCarga(c3);
    System.out.println("Peso Total no Avião " + a1.getNumero() + ": " + a1.getTotalPeso());
    System.out.println("Total Disponível no Avião " + a1.getNumero() + ": " + a1.getTotalDisponivel());

    System.out.println("----------");
    
    a1.adicionarCarga(c1);
    System.out.println("Peso Total no Avião " + a1.getNumero() + ": " + a1.getTotalPeso());
    System.out.println("Total Disponível no Avião " + a1.getNumero() + ": " + a1.getTotalDisponivel());

    System.out.println("----------");

    a2.adicionarCarga(c2);
    a2.adicionarCarga(c4);
    System.out.println("Peso Total no Avião " + a2.getNumero() + ": " + a2.getTotalPeso());
    System.out.println("Total Disponível no Avião " + a2.getNumero() + ": " + a2.getTotalDisponivel());

  }
}