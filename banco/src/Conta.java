import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
  protected static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1001;

  protected int numero;
  protected double saldo;
  protected Cliente cliente;
  protected Agencia agencia;
  protected List<Transacao> historico = new ArrayList<>();

  public Conta(Cliente cliente, Agencia agencia) {
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
    this.agencia = agencia;
    agencia.adicionarConta(this);
    cliente.adicionarConta(this);
  }

  public void sacar(double valor) {
    saldo -= valor;
    historico.add(new Transacao(Transacao.Tipo.SAQUE, valor));
  }

  public void depositar(double valor) {
    saldo += valor;
    historico.add(new Transacao(Transacao.Tipo.DEPOSITO, valor));
  }

  public void transferir(double valor, Conta destino) {
    this.sacar(valor);
    destino.depositar(valor);
    historico.add(new Transacao(Transacao.Tipo.TRANSFERENCIA, valor));
  }

  public void imprimirExtrato() {
    System.out.println("Titular: " + cliente.getNome());
    System.out.println("Conta: " + numero + " | Agência: " + agencia.getNumero());
    System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
    System.out.println("Histórico:");
    for (Transacao t : historico) {
      System.out.println(t);
    }
  }

  public int getNumero() {
    return numero;
  }

  public Cliente getCliente() {
    return cliente;
  }
}
