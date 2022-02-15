class VetorUtil{

  public static int[] tirarZeros(int[] vetorA){

    int contador = 0;
    for(int i = 0; i < vetorA.length; i++){
      if (vetorA[i] == 0){
        contador++;
      }
    }

    int indice = vetorA.length - contador;
    int[] vetor0 = new int[indice];
    int aux = 0;

    for(int i = 0; i < vetorA.length; i++){
      if(vetorA[i] != 0){
        vetor0[aux] = vetorA[i];
        aux++;
      }
    }

    return vetor0;
  }


  public static int[] interseccao(int[] vetorC, int[] vetorD){

    int indice = 0;
    for (int i = 0; i < vetorC.length; i++){
      for(int j = 0; j < vetorD.length; j++){
        if (vetorC[i] == vetorD[j]){
          indice++;
        }
      }
    }



    int[] interseccao = new int[indice];
    int aux = 0;

    for(int i = 0; i < vetorC.length; i++){
      for(int j = 0; j < vetorD.length; j++){
        if (vetorC[i] == vetorD[j]){
          interseccao[aux] = vetorC[i];
          aux++;
        }
      }

    }

    return interseccao;
  } 







  public static int[] retornarIndices(int[] vetorB, int numero){

    int indice = 0;
    for(int i = 0; i < vetorB.length; i++){
      if(vetorB[i] == numero){
        indice++;
      }
    }
    
    int[] vetorQuantidade = new int[indice];
    int aux = 0;

    for(int i = 0; i < vetorB.length; i++){
      if(vetorB[i] == numero){
        vetorQuantidade[aux] = i;
        aux++;
      }
    }

    return vetorQuantidade;
  }

}