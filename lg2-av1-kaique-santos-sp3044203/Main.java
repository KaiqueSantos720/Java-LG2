import java.util.Scanner;
class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o indice de todos os vetores");
    int indice = sc.nextInt();
    System.out.println("\n");

    int[] vetorA = new int[indice];
    System.out.println("Vetor A");
    for(int i = 0; i < vetorA.length; i++){
      System.out.println("Insira o número " + (i+1));
      vetorA[i] = sc.nextInt();
    }
    System.out.println("\n");

    int[] vetorB = new int[indice];
    System.out.println("Vetor B");
    for(int i = 0; i < vetorB.length; i++){
      System.out.println("Insira o número " + (i+1));
      vetorB[i] = sc.nextInt();
    }
    System.out.println("Insira um número para para buscar os índices");
    int numero = sc.nextInt();
    System.out.println("\n");

    int[] vetorC = new int[indice];
    System.out.println("Vetor C");
    for(int i = 0; i < vetorC.length; i++){
      System.out.println("Insira o número " + (i+1));
      vetorC[i] = sc.nextInt();
    }
    System.out.println("\n");

    int[] vetorD = new int[indice];
    System.out.println("Vetor D");
    for(int i = 0; i < vetorD.length; i++){
      System.out.println("Insira o número " + (i+1));
      vetorD[i] = sc.nextInt();
    }
    System.out.println("\n");


    int[] resultado = VetorUtil.retornarIndices(vetorB, numero);
    int[] resultado1 = VetorUtil.interseccao(vetorC, vetorD);
    int[] resultado2 = VetorUtil.tirarZeros(vetorA);

    System.out.println("Vetor A sem zeros");
    for(int i = 0; i < resultado2.length; i++){
      System.out.println(resultado2[i]);
    }
    System.out.println("\n");

    System.out.println("índices do número " + numero);
    for(int i = 0; i < resultado.length; i++){
      System.out.println("índice " + resultado[i]);
    }
    System.out.println("\n");

    System.out.println("Os valores que tem intersecção nos vetores C e D são:");
    for(int i = 0; i < resultado1.length; i++){
      System.out.println(resultado1[i]);
    }

  }

}