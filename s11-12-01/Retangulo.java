public class Retangulo {
  public double lado1;
  public double lado2;

  public double calcularArea() {
    return lado1 * lado2;
  }

  public double calcularPerimetro() {
    return ((2 * lado1) + (2 * lado2));
  }

  public void imprimirRetangulo(){
    System.out.println("-----------");
    System.out.println("Lado 1: " + this.lado1);
    System.out.println("Lado 2: " + this.lado2);
    System.out.println("Área: " + String.format("%.2f", this.calcularArea()));
    System.out.println("Perímetro: " + String.format("%.2f", this.calcularPerimetro()));
    System.out.println("-----------");
  }

}