public class App {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Endereco enderecoAgencia = new Endereco("Av. Principal", "São Paulo", "SP", "12345-000");
        Agencia agencia = new Agencia(1, enderecoAgencia);
        banco.adicionarAgencia(agencia);

        Endereco enderecoCliente = new Endereco("Rua das Flores", "São Paulo", "SP", "04567-000");
        Cliente diego = new Cliente("Diego Bloise", "123.456.789-00", "(11) 91234-5678", enderecoCliente);
        banco.adicionarCliente(diego);

        Conta cc = new ContaCorrente(diego, agencia);
        Conta cp = new ContaPoupanca(diego, agencia);

        cc.depositar(1000);
        cc.transferir(200, cp);

        cc.imprimirExtrato();
        System.out.println();
        cp.imprimirExtrato();
    }
}
