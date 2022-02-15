public class Quadrado {
  private double lado;

  public Quadrado(double lado){
    this.setLado(lado);
  }

  public double getLado(){
    return lado;
  }
  
  public void setLado(double lado){
    if(lado > 0){
      this.lado = lado;
    }
    else{
      throw new IllegalArgumentException("valor ilegal");
    }
  }

  public double calcularArea() {
    return lado * lado;
  }

  public double calcularPerimetro() {
    return 4 * lado;
  }

  public void imprimirQuadrado(){
    System.out.println("Área: " + String.format("%.2f", this.calcularArea()));
    System.out.println("Perímetro: " + String.format("%.2f", this.calcularPerimetro()));
    System.out.println("-----------");
  }

}