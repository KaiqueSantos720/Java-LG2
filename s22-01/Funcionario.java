import java.util.List;
import java.util.ArrayList;

class Funcionario{

  private String nome;
  private List<Funcionario> subordinados;

  public Funcionario (String nome){
    this.subordinados = new ArrayList<>();
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public List<Funcionario> getSubordinados(){
    return subordinados;
  }

  public boolean isChefe(){
    return subordinados.size() > 0;
  }

  public void adicionarSubordinado(Funcionario funcionario){
    
    //Verifica se o subordinado já foi adicionado antes.
    for(int i = 0; i < getSubordinados().size(); i++){
      Funcionario f = getSubordinados().get(i);
      if(f.getNome().equals(funcionario.getNome())){
        throw new IllegalArgumentException("O subordinado " + funcionario.getNome() + " já foi adicionado ao chefe " + getNome());
      }
    }
    
    //Verifica se a quantidade de subordinados é maior ou igual a 5.
    if(getQuantidadeSubordinados() >= 5){
      throw new IllegalArgumentException(getNome() + " já tem subordinados suficientes!!!");
    }

    //Se todos os critérios forem atendidos, um subordinado será adicionado.
    this.subordinados.add(funcionario);
  }

  public Integer getQuantidadeSubordinados(){
    return subordinados.size();
  }
}