class Main {
  public static void main(String[] args) {
    
    Circulo c1 = new Circulo(10);
    c1.setRaio(20);
    System.out.println("Raio: " + c1.getRaio());
    c1.imprimirCirculo();

    
    Retangulo r1 = new Retangulo(3, 1);
    r1.setLado1(12);
    r1.setLado2(4);
    System.out.println("Lado 1: " + r1.getLado1());
    System.out.println("Lado 2: " + r1.getLado2());
    r1.imprimirRetangulo();


    Quadrado q1 = new Quadrado(4);
    q1.setLado(6);
    System.out.println("Lado: " + q1.getLado());
    q1.imprimirQuadrado();


    Conta ct1 = new Conta(3, 120, 400);
    Conta ct2 = new Conta(4, 100, 100);

    ct1.setCodigo(1);
    ct2.setCodigo(2);
    ct1.setLimite(200);
    ct2.setLimite(500);

    ct1.depositar(80);
    ct2.depositar(200);

    ct1.sacar(300);
    ct2.sacar(500);

    ct1.transferir(ct2, 130);
    ct2.transferir(ct1, 50);

    System.out.println("Código: " + ct1.getCodigo());
    System.out.println("Saldo: " + ct1.getSaldo());
    System.out.println("Limite: " + ct1.getLimite());
    System.out.println("Código: " + ct2.getCodigo());
    System.out.println("Saldo: " + ct2.getSaldo());
    System.out.println("Limite: " + ct2.getLimite());


  }
}