class Main {
  public static void main(String[] args) {
    Ator a1 = new Ator("Lucas");
    Ator a2 = new Ator("José");
    Ator a3 = new Ator("Rodrigo");
    Ator a4 = new Ator("Thiago");
    Ator a5 = new Ator("Carlos");

    Filme f1 = new Filme("O Programador", 2010);
    Filme f2 = new Filme("O Analista de Dados", 2021);

    f1.criarPapel(a4, "Detetive");
    f1.criarPapel(a5, "Criminoso");
    f2.criarPapel(a3, "Mágico");
    f2.criarPapel(a1, "Palhaço");
    f2.criarPapel(a2, "Hacker");

    System.out.println("Atores que participaram do filme 1");
    for(Papel p : f1.getPapeis()){
      System.out.println(p.getAtor().getNomeAtor());
    }

    System.out.println("-----------------------");
    
    System.out.println("Atores que participaram do filme 2");
    for(Papel p : f2.getPapeis()){
      System.out.println(p.getAtor().getNomeAtor());
    }

    System.out.println("-----------------------");
    
    System.out.println(a1.getNomeAtor());
    for(Papel p : a1.getPapeis()){
      System.out.println("Filme: " + p.getFilme().getTitulo());
      System.out.println("Ano: " + p.getFilme().getAno());
      System.out.println("Personagem: " + p.getNome());
    }

    System.out.println("-----------------------");

    System.out.println(a5.getNomeAtor());
    for(Papel p : a5.getPapeis()){
      System.out.println("Filme: " + p.getFilme().getTitulo());
      System.out.println("Ano: " + p.getFilme().getAno());
      System.out.println("Personagem: " + p.getNome());
    }

    System.out.println("-----------------------");

    System.out.println(a1.getNomeAtor() + " fez " + a1.getNumeroDePapeis() + " filme");
    System.out.println(a3.getNomeAtor() + " fez " + a3.getNumeroDePapeis() + " filme");
  }
}