import java.util.Arrays;

public class VetorGenerico<T> implements VetorInterfaceGenerico<T>{
  
  private T[] elementos;
  private int tamanho;

  public VetorGenerico(int capacidade){
    this.elementos = (T[]) new Object[capacidade];
    this.tamanho = 0;
  }

  @Override
  public void adicionar(T elemento){
    this.aumentarCapacidade();
    this.elementos[this.tamanho] = elemento;
    this.tamanho++;
  }

  @Override
  public void adicionar(int posicao, T elemento){
    this.aumentarCapacidade();
    this.verificar(posicao);

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
  public T buscar(int posicao){
    this.verificar(posicao);
    return this.elementos[posicao];
  }

  @Override
  public int buscar(T elemento){
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

  public boolean contem(T elemento){ 
    return Arrays.asList(elementos).contains(elemento);
  }

  private void aumentarCapacidade(){
    if(this.tamanho == this.elementos.length){
      T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
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