import java.util.List;
import java.util.ArrayList;

public class Aviao{
  
  private Integer numero;
  private Double limiteMaximoPeso;
  private List<Carga> cargas;

  public Aviao (Integer numero, Double limiteMaximoPeso){
    this.cargas = new ArrayList<>();
    this.numero = numero;
    this.limiteMaximoPeso = limiteMaximoPeso;
  }

  public List<Carga> getCargas(){
    return cargas;
  }

  public Integer getNumero(){
    return numero;
  }

  public void adicionarCarga(Carga carga){
    if(getTotalPeso() + carga.getPeso() > limiteMaximoPeso){
      throw new IllegalArgumentException("Não há espaço no avião");
    }
    
    this.cargas.add(carga);
  }

  public Double getTotalPeso(){
    Double totalCarga = 0.0;

    for(int i = 0; i < getCargas().size(); i++){
      Carga somaCarga = getCargas().get(i);
      totalCarga = somaCarga.getPeso() + totalCarga;
    }

    return totalCarga;
  }

  public Double getTotalDisponivel(){
    return limiteMaximoPeso - getTotalPeso();
  }

}