import java.util.List;
import java.util.ArrayList;

public class Filme{
  private String titulo;
  private Integer ano;
  private List<Papel> papeis;

  public Filme(String titulo, Integer ano){
    this.papeis = new ArrayList<>();
    this.titulo = titulo;
    this.ano = ano;
  }

  public List<Papel> getPapeis(){
    return papeis;
  }

  public String getTitulo(){
    return titulo;
  }

  public Integer getAno(){
    return ano;
  }

  public void addPapel(Papel papel){
    this.papeis.add(papel);
  }

  public void criarPapel(Ator ator, String nome){
    Papel p = new Papel(nome, ator, this);
    this.addPapel(p);
    ator.addPapel(p);
  }

}