public class Vendedor{
  protected String nome;
  protected Double vendas;
  protected Double comissao;

  public Vendedor(String nome, Double vendas, Double comissao){
    this.nome = nome;
    this.vendas = vendas;
    this.comissao = comissao;
  }

  public String getNome(){
    return nome;
  }

  public Double getVendas(){
    return vendas;
  }

  public Double getComissao(){
    return comissao;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setVendas(Double vendas){
    this.vendas = vendas;
  }

  public void setComissao(Double comissao){
    this.comissao = comissao;
  }

  public Double calcularSalario(){
    return vendas * (comissao/100);
  }

}