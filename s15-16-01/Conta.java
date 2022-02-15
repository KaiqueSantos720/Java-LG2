public class Conta {
  public int codigo;
  public double saldo;
  public double limite;

  public Conta(int codigo, double saldo, double limite){
    this.codigo = codigo;
    this.saldo = saldo;
    this.limite = limite;
  }

  public Conta(){
    
  }

  public boolean depositar(double valor) {
    saldo = saldo + valor;
    return true;
  }

  public boolean sacar(double valor) {
    if(valor <= limite){
      saldo = saldo - valor;
      return true;
    }
    return false;
  }

  public boolean transferir(Conta conta, double valor) {
    if(limite >= valor){
      saldo = saldo - valor;
      conta.saldo = conta.saldo + valor;
      return true;
    }
    return false;
  }
  
  public String consultarSaldo(){
    return "Conta: " + codigo + "\nSaldo: " + saldo;
  }

}