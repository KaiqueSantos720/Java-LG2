public class Conta {
  private int codigo;
  private double saldo;
  private double limite;

  public Conta(int codigo, double saldo, double limite){
    this.codigo = codigo;
    this.saldo = saldo;
    this.limite = limite;
  }

  public double getSaldo(){
    return saldo;
  }

  public double getLimite(){
    return limite;
  }
  
  public void setLimite(double limite){
    this.limite = limite;
  }

  public int getCodigo(){
    return codigo;
  }
  
  public void setCodigo(int codigo){
    this.codigo = codigo;
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