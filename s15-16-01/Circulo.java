public class Circulo {
  public double raio;

  public Circulo(double raio){
    this.raio = raio;
  }

  public Circulo(){
    
  }

  public double calcularArea() {
    return Math.PI * Math.pow(raio, 2);
  }

  public double calcularPerimetro() {
    return 2 * Math.PI * raio;
  }
  
  public void imprimirCirculo(){
    System.out.println("-----------");
    System.out.println("Raio: " + this.raio);
    System.out.println("Área: " + String.format("%.2f", this.calcularArea()));
    System.out.println("Perímetro: " + String.format("%.2f", this.calcularPerimetro()));
    System.out.println("-----------");
  }

}