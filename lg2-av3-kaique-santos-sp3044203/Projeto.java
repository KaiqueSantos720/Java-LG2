import java.util.List;
import java.util.ArrayList;

public class Projeto{
  private String titulo;
  private boolean ativo;
  private Curso curso;
  private List<Pessoa> participantes;

  public Projeto(String titulo, boolean ativo, Curso curso){
    this.participantes = new ArrayList<>();
    this.titulo = titulo;
    this.ativo = ativo;
    this.curso = curso;
    this.curso.adicionarProjeto(this);
  }

  public void adicionarParticipante(Pessoa pessoa){
    if(this.ativo == false){
      throw new RuntimeException("Não é possível adicionar participante em um projeto não ativo");
    }
    this.participantes.add(pessoa);
  }

  public int getNumeroParticipantes(){
    return this.participantes.size();
  }

  public String getTitulo(){
    return titulo;
  }

  public boolean getAtivo(){
    return ativo;
  }

  public List<Pessoa> getParticipantes(){
    return participantes;
  }

  public Curso getCurso(){
    return curso;
  }
}