import java.util.ArrayList;
import java.util.List;

public class Agencia {
  private int numero;
  private Endereco endereco;
  private List<Conta> contas = new ArrayList<>();

  public Agencia(int numero, Endereco endereco) {
    this.numero = numero;
    this.endereco = endereco;
  }

  public void adicionarConta(Conta conta) {
    contas.add(conta);
  }

  public int getNumero() {
    return numero;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public List<Conta> getContas() {
    return contas;
  }
}
