class Main {
  public static void main(String[] args) {
    
    Circulo c1 = new Circulo();
    c1.raio = 10;
    c1.imprimirCirculo();

    Circulo c2 = new Circulo();
    c2.raio = 18;
    c2.imprimirCirculo();

    Circulo c3 = new Circulo();
    c3.raio = 24;
    c3.imprimirCirculo();

    Retangulo r1 = new Retangulo();
    r1.lado1 = 6;
    r1.lado2 = 2;
    r1.imprimirRetangulo();

    Retangulo r2 = new Retangulo();
    r2.lado1 = 10.3;
    r2.lado2 = 8.8;
    r2.imprimirRetangulo();

    Retangulo r3 = new Retangulo();
    r3.lado1 = 20;
    r3.lado2 = 30;
    r3.imprimirRetangulo();

  }

}