public class Main {
    public static void main(String[] args) {
        // Criando dois objetos (instâncias da classe ContaBancaria)
        ContaBancaria conta1 = new ContaBancaria("1001-X", "João Silva", 500.0);
        ContaBancaria conta2 = new ContaBancaria("2002-Y", "Maria Souza", 200.0);

        // Extrato Inicial
        conta1.exibirExtrato();

        // Operação 1: Depósito
        conta1.depositar(1000.0);

        // Operação 2: Saque dentro do saldo
        conta1.sacar(300.0);

        // Operação 3: Saque usando parte do limite especial
        conta1.sacar(900.0); // Saldo era 700. Usou 200 do limite especial (saldo fica -200)

        // Operação 4: Tentativa de saque estourando saldo + limite
        conta1.sacar(500.0); // Recusado

        // Operação 5: Transferência entre contas
        conta1.depositar(500.0); // Recupera saldo positivo
        conta1.transferir(200.0, conta2);
          // Exibir extratos finais
        conta1.exibirExtrato();
        conta2.exibirExtrato();
    }
}
