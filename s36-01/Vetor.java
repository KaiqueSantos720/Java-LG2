import java.util.Arrays;

public class Vetor implements VetorInterface{
  
  private Object[] elementos;
  private int tamanho;
 
  public Vetor(int capacidade){
    this.elementos = new Object[capacidade];
    this.tamanho = 0;
  }

  @Override
  public void adicionar(Object elemento){
    this.aumentarCapacidade();  
    this.elementos[this.tamanho] = elemento;
    this.tamanho++;
  }

  @Override
  public void adicionar(int posicao, Object elemento){
    this.verificar(posicao);
    this.aumentarCapacidade();

    for(int i = this.tamanho-1; i >= posicao; i--){
      this.elementos[i+1] = this.elementos[i];
    }

    this.elementos[posicao] = elemento;
    this.tamanho++;
  }

  @Override
  public void remover(int posicao){
    this.verificar(posicao);

    for(int i = posicao; i < tamanho-1; i++){
      this.elementos[i] = this.elementos[i+1];
    }

    this.tamanho--;
    this.elementos[tamanho] = null;
  }

  @Override
  public Object buscar(int posicao){
    this.verificar(posicao);
    return this.elementos[posicao];
  }

  @Override
  public int buscar(Object elemento){
    for(int i = 0; i < this.tamanho; i++){
      if(this.elementos[i].equals(elemento)){
        return i;
      }
    }
    return -1;
  }

  @Override
  public int tamanho(){
    return this.tamanho;
  }

  @Override
  public String toString(){
    return Arrays.toString(this.elementos);
  }

  private void aumentarCapacidade(){
    if(tamanho == elementos.length){
      Object [] elementosNovos = new Object[this.elementos.length * 2];
      for(int i = 0; i < tamanho; i++){
        elementosNovos[i] = elementos[i];
      }
      this.elementos = elementosNovos;
    }
  }

  private void verificar(int posicao){
    if(posicao < 0 || posicao >= tamanho){
      throw new RuntimeException("Argumento Inválido");
    }
  }


}