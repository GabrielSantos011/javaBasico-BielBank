package br.com.bielBank.domain;

public class ContaPoupanca extends Conta {
    private double taxaJuros = 0.01; // Taxa de juros de 1%

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    // Método para render juros sobre o saldo atual
    public void renderJuros() {
        double juros = saldo * taxaJuros;
        saldo += juros;
        System.out.println("Juros de R$" + juros + " aplicados. Novo saldo: R$" + saldo);
    }
}
