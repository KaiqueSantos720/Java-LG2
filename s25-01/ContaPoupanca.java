import java.time.LocalDate;

public class ContaPoupanca extends Conta{
  private LocalDate aniversario;

  public ContaPoupanca(Integer numero, LocalDate dataAbertura, Correntista correntista, Double tarifa, LocalDate aniversario){
    super(numero, dataAbertura, correntista, tarifa);
    this.aniversario = aniversario;
  }

  public LocalDate getAniversario(){
    return aniversario;
  }

  @Override
  public Double calcularTarifa(){
    return 3.0;
  }
}