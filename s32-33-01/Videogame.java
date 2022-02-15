public class Videogame implements ValorEletronico{

  private Double valorJogo;
  private Double valorControle;
  private Double valorProcessador;
  private Double valorPlacaGrafica;
  private Double valorSsd;

  public Videogame(Double valorJogo, Double valorControle, Double valorProcessador, Double valorPlacaGrafica, Double valorSsd){
    this.valorJogo = valorJogo;
    this.valorControle = valorControle;
    this.valorProcessador = valorProcessador;
    this.valorPlacaGrafica = valorPlacaGrafica;
    this.valorSsd = valorSsd;
  }

  @Override
  public Double custoTotal() {
    Double total = 0.0;
    total = this.valorJogo + this.valorControle + this.valorProcessador + this.valorPlacaGrafica + this.valorSsd;
    return total;
  }
}