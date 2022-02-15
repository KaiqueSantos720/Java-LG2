import java.time.LocalDate;

public class ContaSalario extends Conta{
  private Empresa empresa;

  public ContaSalario(Integer numero, LocalDate dataAbertura, Correntista correntista, Double tarifa, Empresa empresa){
    super(numero, dataAbertura, correntista, tarifa);
    this.empresa = empresa;
  }

  public Empresa getEmpresa(){
    return empresa;
  }

  @Override
  public Double calcularTarifa(){
    return 0.0;
  }

}