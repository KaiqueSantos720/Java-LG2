class Main {
  public static void main(String[] args) {
    Vendedor v1 = new Vendedor("José", 10000.00, 25.0);
    VendedorFixo vf1 = new VendedorFixo("Carlos", 8000.00, 30.0, 2000.00);
    Vendedor v2 = new Vendedor("João", 20000.00, 40.0);
    VendedorFixo vf2 = new VendedorFixo("Rodrigo", 15000.00, 15.0, 5000.00);

    System.out.println(v1.getNome() + " ganha " + v1.calcularSalario() + " reais");
    System.out.println(vf1.getNome() + " ganha " + vf1.calcularSalario() + " reais");
    System.out.println(v2.getNome() + " ganha " + v2.calcularSalario() + " reais");
    System.out.println(vf2.getNome() + " ganha " + vf2.calcularSalario() + " reais");
  }
}