import java.util.Scanner;
class Main {
  public static void main(String[] args) { 

    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com a quantidade de números inteiros");
    int indiceNumeros = sc.nextInt();
    int[] numeros = new int[indiceNumeros];

    for(int i = 0; i < numeros.length; i++){
      System.out.println("Entre com o número " + (i+1));
      numeros[i] = sc.nextInt();
    }

    int somaIteracao = somaIterativa(numeros);
    System.out.println("A somaIterativa é: " + somaIteracao);

    int somaRecursao = somaRecursiva(numeros, numeros.length);
    System.out.println("A somaRecursiva é: " + somaRecursao);
    
    sc.close();
  }

  public static int somaRecursiva(int[] numeros, int indice) {

    if(indice == 0){
      return 0;
    }

    return numeros[indice-1] + somaRecursiva(numeros, indice-1);

  }

  public static int somaIterativa(int[] elementos) {

    int soma = 0;

    for(int i = 0; i < elementos.length; i++){
      soma = soma + elementos[i];
    }

    return soma;

  }

}