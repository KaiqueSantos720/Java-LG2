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

  public Double totalTarifas(){
    Double total = 0.0;
    for(Conta conta : contas){
      total += conta.calcularTarifa();
    }
    return total;
  }

}