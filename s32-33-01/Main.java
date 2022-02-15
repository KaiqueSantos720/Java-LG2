class Main {
  public static void main(String[] args) {

    Celular c1 = new Celular(1200.00, 1600.00, 150.00);
    System.out.println("O custo total do celular é: " + c1.custoTotal());

    Headset h1 = new Headset(180.00, 50.00, 220.00);
    System.out.println("O custo total do headset é: " + h1.custoTotal());

    Videogame v1 = new Videogame(380.00, 600.00, 2100.00, 3400.00, 2500.00);
    System.out.println("O custo total do videogame é: " + v1.custoTotal());
  }
}