public interface VetorInterface{
  public void adicionar(Object elemento);
  public void adicionar(int posicao, Object elemento);
  public void remover(int posicao);
  public Object buscar(int posicao);
  public int buscar(Object elemento);
  public int tamanho();
}