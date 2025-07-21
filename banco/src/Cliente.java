import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nome;
  private String cpf;
  private String telefone;
  private Endereco endereco;
  private List<Conta> contas = new ArrayList<>();

  public Cliente(String nome, String cpf, String telefone, Endereco endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;
  }

  public void adicionarConta(Conta conta) {
    contas.add(conta);
  }

  public List<Conta> getContas() {
    return contas;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getTelefone() {
    return telefone;
  }

  public Endereco getEndereco() {
    return endereco;
  }
}
