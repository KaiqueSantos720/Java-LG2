class Main {
  public static void main(String[] args) {
    
    Circulo c1 = new Circulo(10);
    c1.imprimirCirculo();

    
    Retangulo r1 = new Retangulo(6, 2);
    r1.imprimirRetangulo();


    Quadrado q1 = new Quadrado(2);
    q1.imprimirQuadrado();


    Conta ct1 = new Conta(1, 120, 200);
    Conta ct2 = new Conta(2, 100, 500);

    ct1.depositar(80);
    ct2.depositar(200);

    ct1.sacar(300);
    ct2.sacar(500);

    ct1.transferir(ct2, 130);
    ct2.transferir(ct1, 50);
    
    String saldoConta = ct1.consultarSaldo();
    System.out.println(saldoConta);
    saldoConta =  ct2.consultarSaldo();
    System.out.println(saldoConta);

  }
}