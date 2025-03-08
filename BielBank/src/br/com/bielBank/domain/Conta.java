package br.com.bielBank.domain;

import br.com.bielBank.interfaces.OperacoesConta;

public abstract class Conta implements OperacoesConta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito no valor de " + valor +
                    " realizado com sucesso! Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
