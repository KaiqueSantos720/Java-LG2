// javac Main.java
// java Main
class Main {
  public static void main(String[] args) {
    String nome = args[0];
    double notas[] = new double[args.length-1];

    for(int i=0; i<args.length-1; i++){
      notas[i] = Double.parseDouble(args[i+1]);
    }

    double media = Estatistica.calcularMedia(notas);
    double menor = Estatistica.menorValor(notas, args);
    double maior = Estatistica.maiorValor(notas, args);
    exibirNota(nome, media, menor, maior);

  }

  public static void exibirNota(String nome, double media, double menor, double maior) {

    System.out.println(nome + " tem média " + String.format("%.2f", media));
    System.out.println("menor nota " + menor);
    System.out.println("maior nota " + maior);
    
  }
}