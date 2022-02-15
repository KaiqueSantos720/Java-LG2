import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com o número de elementos");
    int numeroElementos = sc.nextInt();
    int[] elementos = new int[numeroElementos];

    for(int i=0; i<numeroElementos; i++){
      System.out.println("Entre com o número " + (i+1));
      elementos[i]=sc.nextInt();
    }

    int maior=elementos[0];
    int menor=elementos[0];

    for(int i=0; i<numeroElementos; i++){
      if(maior<elementos[i]){
        maior=elementos[i];
      }
    }

    for(int i=0; i<numeroElementos; i++){
      if(menor>elementos[i]){
        menor=elementos[i];
      }
    }

    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
    sc.close();

  }
}