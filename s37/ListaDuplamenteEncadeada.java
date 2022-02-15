public class ListaDuplamenteEncadeada<T> implements ListaDuplamenteEncadeadaInterface<T>{
  
  private NoDuplo<T> cabeca;
  private NoDuplo<T> cauda;
  private int tamanho;

  public ListaDuplamenteEncadeada(){
    cabeca = new NoDuplo<>(null, null, null);
    cauda = new NoDuplo<>(cabeca, null, null);
    cabeca.setProximo(cauda);
    tamanho = 0;
  }

  private void adicionarEntre(T elemento, NoDuplo<T> anterior, NoDuplo<T> proximo){
    NoDuplo<T> no = new NoDuplo<>(anterior, elemento, proximo);
    anterior.setProximo(no);
    proximo.setAnterior(no);
    tamanho++; 
  }

  @Override
  public void adicionarInicio(T elemento){
    adicionarEntre(elemento, cabeca, cabeca.getProximo());
  }

  @Override
  public void adicionarFim(T elemento){
    adicionarEntre(elemento, cauda.getAnterior(), cauda);
  }

  private void remover(NoDuplo<T> no){
    NoDuplo<T> anterior = no.getAnterior();
    NoDuplo<T> proximo = no.getProximo();
    anterior.setProximo(proximo);
    proximo.setAnterior(anterior);
    tamanho--;
  }

  @Override
  public void removerInicio(){
    if(vazia()) throw new RuntimeException("Lista Vazia");
    remover(cabeca.getProximo());
  }

  @Override
  public void removerFim(){
    if(vazia()) throw new RuntimeException("Lista Vazia");
    remover(cauda.getAnterior());
  }

  @Override
  public T primeiro(){
    if(vazia()) throw new RuntimeException("Lista Vazia");
    return cabeca.getProximo().getElemento();
  }

  @Override
  public T ultimo(){
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

  @Override
  public T buscar(int posicao){
    if(vazia()) throw new RuntimeException("Lista Vazia");
    if(posicao >= tamanho || posicao < 0) throw new RuntimeException("Posição Inválida");

    NoDuplo<T> no = cabeca.getProximo();
    for(int i = 0; i < posicao; i++){
      no = no.getProximo();
    }
    
    return no.getElemento();
  }

  @Override
  public void adicionar(int posicao, T elemento){
    if(vazia()) throw new RuntimeException("Lista Vazia");
    if(posicao >= tamanho || posicao < 0) throw new RuntimeException("Posição Inválida");

    NoDuplo<T> ant = cabeca.getProximo();
    for(int i = 0; i < posicao - 1; i++){
      ant = ant.getProximo();
    }
    
    if(posicao == 0){
      adicionarInicio(elemento);
    }

    if(posicao > 0){
      adicionarEntre(elemento, ant, ant.getProximo());
    }

  }

  public void imprimir(){
    for(NoDuplo<T> aux = cabeca; aux != null; aux = aux.getProximo()){
      System.out.println(aux.getElemento());
    }
  }

}