public class Empresa{
  private String cnpj;
  private String nome;

  public Empresa(String cnpj, String nome){
    this.cnpj = cnpj;
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public String getCnpj(){
    return cnpj;
  }
}