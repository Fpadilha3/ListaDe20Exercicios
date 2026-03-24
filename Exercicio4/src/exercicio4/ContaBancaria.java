
package exercicio4;


public class ContaBancaria {
   
    private int numero;
    private double saldo;
    private String titular;

    // Construtor
    public ContaBancaria(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Métodos principais
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: " + valor);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // 👤 Classe Cliente (interna)
    public static class Cliente {
        private String nome;
        private String cpf;

        public Cliente(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
    }

    // 🏦 Conta Corrente
    public static class ContaCorrente extends ContaBancaria {
        public ContaCorrente(int numero, double saldo, String titular) {
            super(numero, saldo, titular);
        }

        @Override
        public void sacar(double valor) {
            double taxa = 2.0;
            double total = valor + taxa;

            if (getSaldo() >= total) {
                setSaldo(getSaldo() - total);
                System.out.println("Saque com taxa realizado: " + valor);
            } else {
                System.out.println("Saldo insuficiente (com taxa)!");
            }
        }
    }

    // 💰 Conta Poupança
    public static class ContaPoupanca extends ContaBancaria {
        public ContaPoupanca(int numero, double saldo, String titular) {
            super(numero, saldo, titular);
        }

        @Override
        public double consultarSaldo() {
            double rendimento = getSaldo() * 0.01;
            setSaldo(getSaldo() + rendimento);
            return getSaldo();
        }
    }

    // 💼 Conta Salário
    public static class ContaSalario extends ContaBancaria {
        public ContaSalario(int numero, double saldo, String titular) {
            super(numero, saldo, titular);
        }

        @Override
        public void sacar(double valor) {
            if (valor > 1000) {
                System.out.println("Limite de saque excedido!");
            } else {
                super.sacar(valor);
            }
        }
    }
}