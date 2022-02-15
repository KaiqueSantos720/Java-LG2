import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Curso{
  private String nome;
  private String sigla;
  private List<Projeto> projetos;

  public Curso(String nome, String sigla){
    this.nome = nome;
    this.sigla = sigla;
    this.projetos = new ArrayList<>();
  }

  public void adicionarProjeto(Projeto projeto){
    this.projetos.add(projeto);
  }

  public int getNumeroProjetos(){
    return this.projetos.size();
  }

  public List<Projeto> getProjetosAtivos(){
    //List<Projeto> ativos = new ArrayList<>();
    //for(Projeto projetoAtivo : projetos){
    //  if(projetoAtivo.getAtivo() == true){
    //    ativos.add(projetoAtivo);
    //  }
    //}
    //return ativos;
    return projetos.stream().filter(p -> p.getAtivo()).collect(Collectors.toList());
  }

  public int getNumeroProjetosAtivos(){
    return getProjetosAtivos().size();
  }

  public List<Projeto> getProjetos(){
    return projetos;
  }

  public String getNome(){
    return nome;
  }

  public String getSigla(){
    return sigla;
  }
  
}