class Main {
  public static void main(String[] args) {
    String[] times = {"Corinthians", "Flamengo", "Grêmio", "Palmeiras", "São Paulo"};
    String time = "São Paulo";

    int posicaoEncontrada = buscaBinaria(time, times);

    if(posicaoEncontrada>=0){
      System.out.println(times[posicaoEncontrada] + " foi encontrado na posição " + posicaoEncontrada);
    }

    else{
      System.out.println("Time não encontrado");
    }

  }

  public static int buscaBinaria(String elemento, String[] elementos){
    int inicio = 0;
    int fim = elementos.length - 1;
    int meio;

    while(inicio <= fim) {
      meio = (int) (inicio + fim) / 2;

      if(elementos[meio].compareTo(elemento)==0){
        return meio;
      }
      else if(elementos[meio].compareTo(elemento) < 0){
        inicio = meio + 1;
      }
      else{
        fim = meio - 1;
      }
    }

    return -1;

  }
}