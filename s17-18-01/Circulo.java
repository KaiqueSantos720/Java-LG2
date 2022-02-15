public class Circulo {
  private double raio;

  public Circulo(double raio){
    this.setRaio(raio);
  }

  public double getRaio(){
    return raio;
  }
  
  public void setRaio(double raio){
    if(raio > 0){
      this.raio = raio;
    }
    else{
      throw new IllegalArgumentException("valor ilegal");
    }
  }

  public double calcularArea() {
    return Math.PI * Math.pow(raio, 2);
  }

  public double calcularPerimetro() {
    return 2 * Math.PI * raio;
  }
  
  public void imprimirCirculo(){
    System.out.println("Área: " + String.format("%.2f", this.calcularArea()));
    System.out.println("Perímetro: " + String.format("%.2f", this.calcularPerimetro()));
    System.out.println("-----------");
  }

}