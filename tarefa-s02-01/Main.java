import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com o número de notas");
    int nn = sc.nextInt();
    float soma=0;
    float[] notas = new float[nn];
    for(int i=0; i<nn; i++){
      System.out.println("Entre com a nota " + (i+1));
      notas[i]=sc.nextFloat();
      soma=(notas[i]+soma);
    }
    float media=(soma/nn);
    System.out.println("Média: " + media);
    sc.close();
  }
}