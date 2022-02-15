public interface Pilha<T>{
  public void empilha(T elemento);
  public T desempilha();
  public T topo();
  public int tamanho();
  public boolean vazia();
}