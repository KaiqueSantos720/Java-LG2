public class Quadrado {
  public double lado;

  public Quadrado(double lado){
    this.lado = lado;
  }

  public Quadrado(){
    
  }

  public double calcularArea() {
    return lado * lado;
  }

  public double calcularPerimetro() {
    return 4 * lado;
  }

  public void imprimirQuadrado(){
    System.out.println("-----------");
    System.out.println("Lado: " + this.lado);
    System.out.println("Área: " + String.format("%.2f", this.calcularArea()));
    System.out.println("Perímetro: " + String.format("%.2f", this.calcularPerimetro()));
    System.out.println("-----------");
  }

}