class Main {
  public static void main(String[] args) {

    Funcionario f1 = new Funcionario("José");
    Funcionario f2 = new Funcionario("André");
    Funcionario f3 = new Funcionario("João");
    Funcionario f4 = new Funcionario("Pedro");
    Funcionario f5 = new Funcionario("Thiago");
    Funcionario f6 = new Funcionario("Antônio");
    Funcionario f7 = new Funcionario("Rodrigo");

    f1.adicionarSubordinado(f2);
    f1.adicionarSubordinado(f3);
    f1.adicionarSubordinado(f4);
    f1.adicionarSubordinado(f5);
    f1.adicionarSubordinado(f6);

    f5.adicionarSubordinado(f2);
    f5.adicionarSubordinado(f4);
    f5.adicionarSubordinado(f3);

    f7.adicionarSubordinado(f4);
    f7.adicionarSubordinado(f3);

    System.out.println(f1.getNome() + " é chefe? " + f1.isChefe());
    System.out.println(f2.getNome() + " é chefe? " + f2.isChefe());
    System.out.println(f3.getNome() + " é chefe? " + f3.isChefe());
    System.out.println(f4.getNome() + " é chefe? " + f4.isChefe());
    System.out.println(f5.getNome() + " é chefe? " + f5.isChefe());
    System.out.println(f6.getNome() + " é chefe? " + f6.isChefe());
    System.out.println(f7.getNome() + " é chefe? " + f7.isChefe());

    System.out.println("-----------------------");

    System.out.println(f1.getNome() + " tem " + f1.getQuantidadeSubordinados() + " subordinados, são eles:");
    for(Funcionario f : f1.getSubordinados()){
      System.out.println(f.getNome());
    }

    System.out.println("-----------------------");

    System.out.println(f5.getNome() + " tem " + f5.getQuantidadeSubordinados() + " subordinados, são eles:");
    for(Funcionario f : f5.getSubordinados()){
      System.out.println(f.getNome());
    }

    System.out.println("-----------------------");

    System.out.println(f7.getNome() + " tem " + f7.getQuantidadeSubordinados() + " subordinados, são eles:");
    for(Funcionario f : f7.getSubordinados()){
      System.out.println(f.getNome());
    }

    System.out.println("-----------------------");

    System.out.println(f2.getNome() + " tem " + f2.getQuantidadeSubordinados() + " subordinados");
    System.out.println(f3.getNome() + " tem " + f3.getQuantidadeSubordinados() + " subordinados");
    System.out.println(f4.getNome() + " tem " + f4.getQuantidadeSubordinados() + " subordinados");
    System.out.println(f6.getNome() + " tem " + f6.getQuantidadeSubordinados() + " subordinados");
  }
}