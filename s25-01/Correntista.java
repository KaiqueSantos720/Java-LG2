import java.util.List;
import java.util.ArrayList;

public class Correntista{
  private Integer codigo;
  private String nome;
  private List<Conta> contas;

  public Correntista(Integer codigo, String nome){
    this.contas = new ArrayList<>();
    this.codigo = codigo;
    this.nome = nome;
  }

  public void addConta(Conta conta){
    this.contas.add(conta);
  }

  public Integer getCodigo(){
    return codigo;
  }

  public String getNome(){
    return nome;
  }

  public List<Conta> getContas(){
    return contas;
  }

  public Double totalTarifa(){
    Double total = 0.0;
    for(int i = 0; i < getContas().size(); i++){
      Conta somaTarifa = getContas().get(i);
      total += somaTarifa.calcularTarifa();
    }
    return total;
  }

}