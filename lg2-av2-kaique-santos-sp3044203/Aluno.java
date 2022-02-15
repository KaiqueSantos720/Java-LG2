class Aluno{
  private String prontuario;
  private String nome;

  public Aluno(){

  }

  public Aluno(String prontuario, String nome){
    this.setProntuario(prontuario);
    this.setNome(nome);  
  }

  //Primeiro if: verifica se a string tem 8 caracteres e se inicia com "sp";
  //Segundo if: verifica se após o "sp" tem somente números;
  //length() conta os caracteres da string;
  //toLowerCase() deixa toda a string em letra minúscula, mas sem alterar o valor original;
  //startsWith() verifica se a string inicia com "sp";
  //substring() divide a string a partir do "sp" inicial;
  //matches() verifica se após o "sp" inicial há somente números.
  
  public void setProntuario(String prontuario){
    if(prontuario.length() == 8 && prontuario.toLowerCase().startsWith("sp") == true){
      if(prontuario.substring(2).matches("[0-9]*")){
        this.prontuario = prontuario;
      }
      else{
        throw new IllegalArgumentException("Prontuário Inválido, deve iniciar com sp e ter 8 caracteres, além disso, após o sp só pode ter números.");
      }
    }
    else{
      throw new IllegalArgumentException("Prontuário Inválido, deve iniciar com sp e ter 8 caracteres.");
    }
  }

  public String getProntuario(){
    return prontuario;
  }

  //o if verifica se o número de caracteres do nome está entre 5 e 100;
  //trim() retira os espaços da string;
  //length() conta os caracteres da string após o trim() atuar sobre ela.

  public void setNome(String nome){
    if(nome.trim().length() >= 5 && nome.trim().length() <= 100){
      this.nome = nome;
    }
    else{
      throw new IllegalArgumentException("Nome Ilegal, deve ter entre 5 e 100 letras.");
    }
  }

  public String getNome(){
    return nome;
  }
}