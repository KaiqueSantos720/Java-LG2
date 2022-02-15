public class ListaFila<T> implements Fila<T>{
  
  private No<T> cabeca;
  private No<T> cauda;
  private int tamanho;

  public ListaFila(){
    cabeca = new No<>(null, null, null);
    cauda = new No<>(cabeca, null, null);
    cabeca.setProximo(cauda);
    tamanho = 0;
  }

  private void adicionarEntre(T elemento, No<T> anterior, No<T> proximo){
    No<T> no = new No<>(anterior, elemento, proximo);
    anterior.setProximo(no);
    proximo.setAnterior(no);
    tamanho++; 
  }

  private void remover(No<T> no){
    No<T> anterior = no.getAnterior();
    No<T> proximo = no.getProximo();
    anterior.setProximo(proximo);
    proximo.setAnterior(anterior);
    tamanho--;
  }

  @Override
  public void enfileirar(T elemento){
    adicionarEntre(elemento, cauda.getAnterior(), cauda);
  }

  @Override
  public T desenfileirar(){
    if(vazia()) throw new RuntimeException("Lista Vazia");
    T auxiliar = cabeca.getProximo().getElemento();
    remover(cabeca.getProximo());
    return auxiliar;
  }

  @Override
  public T primeiro(){
    if(vazia()) throw new RuntimeException("Lista Vazia");
    return cabeca.getProximo().getElemento();
  }

  @Override
  public int tamanho(){
    return tamanho;
  }

  @Override
  public boolean vazia(){
    return tamanho == 0;
  }

}