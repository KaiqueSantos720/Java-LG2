import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    Correntista ct1 = new Correntista(1, "José");
    Correntista ct2 = new Correntista(1, "Lucas");
    Empresa e1 = new Empresa("123456789", "EMP1");

    ContaCorrente cc1 = new ContaCorrente(10, LocalDate.now(), ct1, 5.0, 1000.00);
    ContaPoupanca cp1 = new ContaPoupanca(11, LocalDate.now(), ct1, 3.0, LocalDate.of(2000, 10, 12));
    ContaSalario cs1 = new ContaSalario(12, LocalDate.now(), ct2, 0.0, e1);
    ContaPoupanca cp2 = new ContaPoupanca(13, LocalDate.now(), ct2, 3.0, LocalDate.of(1980, 6, 29));
    ContaPoupanca cp3 = new ContaPoupanca(14, LocalDate.now(), ct2, 3.0, LocalDate.of(1980, 6, 29));
    ContaSalario cs2 = new ContaSalario(15, LocalDate.now(), ct2, 0.0, e1);


    cp1.depositar(5000.00);
    cs1.depositar(20000.00);
    cp2.depositar(1000.00);
    cc1.depositar(2800.00);
    cp3.depositar(1500000.00);
    cs2.depositar(1200.00);

    cp1.sacar(2000.00);
    cp2.sacar(800.00);
    cs2.sacar(100.00);

    for(Conta c : ct1.getContas()){
      System.out.println("Nome: " + c.getCorrentista().getNome());
      System.out.println("Número da Conta: " + c.getNumero());
      System.out.println("Saldo da Conta: " + c.getSaldo());
      System.out.println("Data de Abertura: " + c.getDataAbertura());
      System.out.println("Tarifa: " + c.getTarifa());
      System.out.println("---------------------------------");
    }
    System.out.println("Total da Tarifa: " + ct1.totalTarifa());

    System.out.println("\n\n\n");

    for(Conta c : ct2.getContas()){
      System.out.println("Nome: " + c.getCorrentista().getNome());
      System.out.println("Número da Conta: " + c.getNumero());
      System.out.println("Saldo da Conta: " + c.getSaldo());
      System.out.println("Data de Abertura: " + c.getDataAbertura());
      System.out.println("Tarifa: " + c.getTarifa());
      System.out.println("---------------------------------");
    }
    System.out.println("Total da Tarifa: " + ct2.totalTarifa());

    System.out.println("\n\n\n");

    System.out.println("Conta Salário 1");
    System.out.println("Nome do Correntista: " + cs1.getCorrentista().getNome());
    System.out.println("Número da Conta Salário: " + cs1.getNumero());
    System.out.println("Nome da Empresa: " + cs1.getEmpresa().getNome());
    System.out.println("CNPJ da Empresa: " + cs1.getEmpresa().getCnpj());

  }
}