class Main {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.codigo = 1;
    c1.saldo = 120;
    c1.limite = 200;

    Conta c2 = new Conta();
    c2.codigo = 2;
    c2.saldo = 100;
    c2.limite = 500;

    boolean verificacao = c1.depositar(80);
    System.out.println(verificacao);
    verificar(verificacao);

    verificacao = c2.depositar(200);
    System.out.println(verificacao);
    verificar(verificacao);

    System.out.println("--------------");

    verificacao = c1.sacar(300);
    System.out.println(verificacao);
    verificar(verificacao);

    verificacao = c2.sacar(500);
    System.out.println(verificacao);
    verificar(verificacao);

    System.out.println("--------------");

    verificacao = c1.transferir(c2, 130);
    System.out.println(verificacao);
    verificar(verificacao);

    verificacao = c2.transferir(c1, 50);
    System.out.println(verificacao);
    verificar(verificacao);

    System.out.println("--------------");

    String saldoConta = c1.consultarSaldo();
    System.out.println(saldoConta);
    saldoConta =  c2.consultarSaldo();
    System.out.println(saldoConta);
    
    System.out.println("--------------");
  }

  public static void verificar(boolean verificacao){
    if(verificacao == true){
      System.out.println("Operação realizada com sucesso");
    }
    if(verificacao == false){
      System.out.println("Falha na operação");
    }
  }
  
}