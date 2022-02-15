import java.util.List;
import java.util.ArrayList;

public class Ator{
  private String nome;
  private List<Papel> papeis;

  public Ator(String nome){
    this.papeis = new ArrayList<>();
    this.nome = nome;
  }

  public void addPapel(Papel papel){
    this.papeis.add(papel);
  }

  public List<Papel> getPapeis(){
    return papeis;
  }

  public String getNomeAtor(){
    return nome;
  }

  public Integer getNumeroDePapeis(){
    return this.papeis.size();
  }

  
}