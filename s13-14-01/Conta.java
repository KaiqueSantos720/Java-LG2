public class Conta {
  public int codigo;
  public double saldo;
  public double limite;

  public String consultarSaldo(){
    return "Conta: " + codigo + "\nSaldo: " + saldo;
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

}