public class Carga{
  
  private Integer numero;
  private Double peso;

  public Carga (Integer numero, Double peso){
    this.numero = numero;
    this.peso = peso;
  }

  public Double getPeso(){
    return peso;
  }

  public Integer getNumero(){
    return numero;
  }

}