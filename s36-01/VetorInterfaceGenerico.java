public interface VetorInterfaceGenerico<T> {
  public void adicionar(T elemento);
  public void adicionar(int posicao, T elemento);
  public void remover(int posicao);
  public T buscar(int posicao);
  public int buscar(T elemento);
  public int tamanho();
  public boolean contem(T elemento);
}