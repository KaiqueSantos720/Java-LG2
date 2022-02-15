import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantos números deseja inserir?");
    int indiceVetor = sc.nextInt();
    int[] numeros = new int[indiceVetor];

    for(int i = 0; i < numeros.length; i++){
      System.out.println("Entre com o número " + (i+1));
      numeros[i]=sc.nextInt();
    }

    int[] numerosBubble = Ordenacao.bubbleSort(numeros);
    int[] numerosInsertion = Ordenacao.insertionSort(numeros);

    System.out.println("Vetor Desordenado");
    VetorUtil.imprimirVetor(numeros);

    System.out.println("Ordenação com Bubble Sort");
    VetorUtil.imprimirVetor(numerosBubble);

    System.out.println("Ordenação com Insertion Sort");
    VetorUtil.imprimirVetor(numerosInsertion);

    sc.close();
  }
}