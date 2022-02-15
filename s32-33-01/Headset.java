public class Headset implements ValorEletronico{
  
  private Double valorMicrofone;
  private Double valorEspuma;
  private Double valorSuporte;

  public Headset(Double valorMicrofone, Double valorEspuma, Double valorSuporte){
    this.valorMicrofone = valorMicrofone;
    this.valorEspuma = valorEspuma;
    this.valorSuporte = valorSuporte;
  }

  @Override
  public Double custoTotal() {
    Double total = 0.0;
    total = this.valorMicrofone + this.valorEspuma + this.valorSuporte;
    return total;
  }
}