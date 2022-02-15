public class NoDuplo<T>{
  private T elemento;
  private NoDuplo<T> proximo;
  private NoDuplo<T> anterior;

  public NoDuplo(NoDuplo<T> anterior, T elemento, NoDuplo<T> proximo){
    this.anterior = anterior;
    this.elemento = elemento;
    this.proximo = proximo;
  }

  public T getElemento(){
    return elemento;
  }

  public void setElemento(T elemento){
    this.elemento = elemento;
  }

  public NoDuplo<T> getProximo(){
    return proximo;
  }

  public void setProximo(NoDuplo<T> proximo){
    this.proximo = proximo;
  }

  public NoDuplo<T> getAnterior(){
    return anterior;
  }

  public void setAnterior(NoDuplo<T> anterior){
    this.anterior = anterior;
  }
  
}