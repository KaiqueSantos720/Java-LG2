public class Retangulo {
  private double lado1;
  private double lado2;

  public Retangulo(double lado1, double lado2){
    this.setLado1(lado1);
    this.setLado2(lado2);
  }

  public double getLado1(){
    return lado1;
  }
  
  public void setLado1(double lado1){
    if(lado1 > 0){
      this.lado1 = lado1;
    }
    else{
      throw new IllegalArgumentException("valor ilegal");
    }
  }

  public double getLado2(){
    return lado2;
  }
  
  public void setLado2(double lado2){
    if(lado2 > 0){
      this.lado2 = lado2;
    }
    else{
      throw new IllegalArgumentException("valor ilegal");
    }
  }
  
  public double calcularArea() {
    return lado1 * lado2;
  }

  public double calcularPerimetro() {
    return ((2 * lado1) + (2 * lado2));
  }

  public void imprimirRetangulo(){
    System.out.println("Área: " + String.format("%.2f", this.calcularArea()));
    System.out.println("Perímetro: " + String.format("%.2f", this.calcularPerimetro()));
    System.out.println("-----------");
  }

}