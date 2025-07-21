import java.time.LocalDateTime;

public class Transacao {
  public enum Tipo {
    DEPOSITO, SAQUE, TRANSFERENCIA
  }

  private Tipo tipo;
  private double valor;
  private LocalDateTime data;

  public Transacao(Tipo tipo, double valor) {
    this.tipo = tipo;
    this.valor = valor;
    this.data = LocalDateTime.now();
  }

  @Override
  public String toString() {
    return "[" + data + "] " + tipo + " de R$ " + String.format("%.2f", valor);
  }
}
