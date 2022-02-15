 public interface VetorInterface{
  public void adicionar(String elemento);
  public void adicionar(int posicao, String elemento);
  public void remover(int posicao);
  public String buscar(int posicao);
  public int buscar(String elemento);
  public int tamanho();
}