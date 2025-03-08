package br.com.bielBank.domain;

public class ContaCorrente extends Conta {
    private double taxaSaque = 2.50; // Taxa fixa para cada saque

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + taxaSaque;
        if (valor > 0 && valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + taxaSaque +
                    ". Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }
}
