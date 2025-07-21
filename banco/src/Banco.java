import java.util.ArrayList;
import java.util.List;

public class Banco {
  private String nome;
  private List<Cliente> clientes = new ArrayList<>();
  private List<Agencia> agencias = new ArrayList<>();

  public Banco(String nome) {
    this.nome = nome;
  }

  public void adicionarCliente(Cliente cliente) {
    clientes.add(cliente);
  }

  public void adicionarAgencia(Agencia agencia) {
    agencias.add(agencia);
  }

  public Cliente buscarClientePorCPF(String cpf) {
    for (Cliente c : clientes) {
      if (c.getCpf().equals(cpf))
        return c;
    }
    return null;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  public List<Agencia> getAgencias() {
    return agencias;
  }

  public String getNome() {
    return nome;
  }
}
