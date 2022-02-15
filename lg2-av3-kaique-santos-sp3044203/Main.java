public class Main {

  public static void main(String[] args) {
    Curso curso1 = new Curso("Integrado em Informática", "CEMI");
    Curso curso2 = new Curso("Análise e Desenvolvimento de Sistemas", "TADS");

    Aluno aluno1 = new Aluno("SP0101", "Maria", true);
    Aluno aluno2 = new Aluno("SP0202", "Pedro", true);
    Aluno aluno3 = new Aluno("SP0303", "João", true);

    Professor professor1 = new Professor("SP0404", "Gustavo", "Ciência da Computação");
    Professor professor2 = new Professor("SP0505", "Ricardo", "Banco de Dados");

    Projeto projeto1 = new Projeto("Desenvolvimento do site da monitoria", true, curso1);
    projeto1.adicionarParticipante(aluno1);
    projeto1.adicionarParticipante(aluno2);
    projeto1.adicionarParticipante(professor1);

    System.out.println(projeto1.getNumeroParticipantes()); // deve imprimir 3

    Projeto projeto2 = new Projeto("Análise de dados de evasão escolar", true, curso1);
    projeto2.adicionarParticipante(aluno3);
    projeto2.adicionarParticipante(professor2);

    System.out.println(curso1.getNumeroProjetosAtivos()); // deve imprimir 2
    for (Projeto projeto: curso1.getProjetosAtivos()) {
      System.out.println(projeto.getTitulo()); // deve imprimir Desenvolvimento do site da monitoria e Análise de dados de evasão escolar
    }


    Projeto projeto3 = new Projeto("Sistema acadêmico mobile", false, curso2);

    System.out.println(curso2.getNumeroProjetos()); // deve imprimir 1
    System.out.println(curso2.getNumeroProjetosAtivos()); // deve imprimir 0

    projeto3.adicionarParticipante(aluno1); // deve lançar uma exceção por conta do projeto não estar ativo
  }
}