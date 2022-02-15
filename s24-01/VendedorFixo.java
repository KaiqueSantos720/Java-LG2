public class VendedorFixo extends Vendedor{
  private Double salario;

  public VendedorFixo(String nome, Double vendas, Double comissao, Double salario){
    super(nome, vendas, comissao);
    this.salario = salario;
  }

  public Double getSalario(){
    return salario;
  }

  public void setSalario(Double salario){
    this.salario = salario;
  }

  @Override
  public Double calcularSalario(){
    return(vendas * (comissao/100)) + salario;
  }
}