public class ListaPilha<T> implements Pilha<T>{
  
  private No<T> cabeca;
  private No<T> cauda;
  private int tamanho;
  
  public ListaPilha(){
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
  public void empilha(T elemento){
    adicionarEntre(elemento, cauda.getAnterior(), cauda);
  }

  @Override
  public T desempilha(){
    if(vazia()) throw new RuntimeException("Lista Vazia");
    T auxiliar = cauda.getAnterior().getElemento();
    remover(cauda.getAnterior());
    return auxiliar;
  }

  @Override
  public T topo(){
    if(vazia()) throw new RuntimeException("Lista Vazia");
    return cauda.getAnterior().getElemento();
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