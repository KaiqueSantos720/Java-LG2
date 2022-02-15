import java.time.LocalDate;

public class Conta{
  private Integer numero;
  private LocalDate dataAbertura;
  private Correntista correntista;
  protected Double saldo;
  protected Double tarifa;

  public Conta(Integer numero, LocalDate dataAbertura, Correntista correntista, Double tarifa){
    this.numero = numero;
    this.correntista = correntista;
    this.dataAbertura = dataAbertura;
    this.saldo = 0.0; //inicializa todas as contas com saldo de 0
    this.tarifa = tarifa;
    this.correntista.addConta(this);
  }

  public Integer getNumero(){
    return numero;
  }

  public LocalDate getDataAbertura(){
    return dataAbertura;
  }

  public Correntista getCorrentista(){
    return correntista;
  }

  public Double getSaldo(){
    return saldo;
  }

  public Double getTarifa(){
    return tarifa;
  }

  public void sacar(Double valor){
    if(saldo < valor){
      throw new RuntimeException("Você não tem dinheiro para sacar");
    }
    saldo -= valor;
  }

  public void depositar(Double valor){
    if(valor < 0){
      throw new RuntimeException("Valor negativo não é aceito");
    }
    saldo += valor;
  }

  public Double calcularTarifa(){
    return tarifa;
  }


}