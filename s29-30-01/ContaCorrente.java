import java.time.LocalDate;

public class ContaCorrente extends Conta{
  private Double limite;

  public ContaCorrente(Integer numero, LocalDate dataAbertura, Correntista correntista, Double tarifa, Double limite){
    super(numero, dataAbertura, correntista, tarifa);
    this.limite = limite;
  }

  public Double getLimite(){
    return limite;
  }
  
  @Override
  public Double calcularTarifa(){
    return this.tarifa * 1.5;
  }

  @Override
  public void sacar(Double valor){
    if(limite < valor){
      throw new IllegalArgumentException("Você não tem limite para sacar");
    }
    saldo = saldo - valor;
  }

  
}