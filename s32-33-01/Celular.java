public class Celular implements ValorEletronico{
  
  private Double valorCamera;
  private Double valorTela;
  private Double valorCarregador;

  public Celular(Double valorCamera, Double valorTela, Double valorCarregador){
    this.valorCamera = valorCamera;
    this.valorTela = valorTela;
    this.valorCarregador = valorCarregador;
  }

  @Override
  public Double custoTotal() {
    Double total = 0.0;
    total = this.valorCamera + this.valorTela + this.valorCarregador;
    return total;
  }
}