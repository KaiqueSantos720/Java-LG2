class Estatistica {
  public static double calcularMedia(double[] valores) {
    double soma = 0.0;

    for(double valor : valores) {
      soma += valor;
    }

    return soma / valores.length;
  }

  public static double menorValor(double[] menores, String[] args){
    double menor = menores[0];

    for(int i = 0; i < args.length-1; i++){
      if(menor > menores[i]){
        menor = menores[i]; 
      }
    }

    return menor;
  }

  public static double maiorValor(double[] maiores, String[] args){
    double maior = maiores[0];

    for(int i = 0; i < args.length-1; i++){
      if(maior < maiores[i]){
        maior = maiores[i];
      }
    }
    
    return maior;
  }
}