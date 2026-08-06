public class ContaBancaria {

    // 1. Atributos Privados (Encapsulamento)
    private String numeroConta;
    private String titular;
    private double saldo;
    private double limiteEspecial;

    // 2. Construtor (Inicialização do objeto)
    public ContaBancaria(String numeroConta, String titular, double limiteEspecial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.limiteEspecial = limiteEspecial;
        this.saldo = 0.0; // Toda conta nova inicia com saldo zerado
    }

    // 3. Métodos com Regras de Negócio

    // Operação de Depósito
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("✅ Depósito de R$ " + valor + " realizado com sucesso para " + this.titular);
        } else {
            System.out.println("❌ Valor de depósito inválido!");
        }
    }

    // Operação de Saque com verificação de saldo + limite
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("❌ O valor do saque deve ser maior que zero!");
            return false;
        }

        double saldoTotalDisponivel = this.saldo + this.limiteEspecial;

        if (valor <= saldoTotalDisponivel) {
            this.saldo -= valor;
            System.out.println("✅ Saque de R$ " + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("❌ Saque recusado para " + this.titular + ": Saldo e limite insuficientes!");
            return false;
        }
    }

    // Operação de Transferência entre duas contas
    public boolean transferir(double valor, ContaBancaria destino) {
        System.out.println("\n--- Iniciando Transferência ---");
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("✅ Transferência de R$ " + valor + " realizada para " + destino.getTitular());
            return true;
        } else {
            System.out.println("❌ Transferência não realizada.");
            return false;
        }
    }

    // Impressão do estado da conta
    public void exibirExtrato() {
        System.out.println("\n----------------------------");
        System.out.println("      EXTRATO BANCÁRIO      ");
        System.out.println("----------------------------");
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo Atual: R$ " + this.saldo);
        System.out.println("Limite Especial: R$ " + this.limiteEspecial);
        System.out.println("Saldo Total Disponível: R$ " + (this.saldo + this.limiteEspecial));
        System.out.println("----------------------------");
    }
    // 4. Getters e Setters (Acesso controlado)
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
}

