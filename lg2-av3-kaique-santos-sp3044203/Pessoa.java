public class Pessoa{
  protected String prontuario;
  protected String nome;

  public Pessoa(String prontuario, String nome){
    this.prontuario = prontuario;
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public String getProntuario(){
    return prontuario;
  }
}