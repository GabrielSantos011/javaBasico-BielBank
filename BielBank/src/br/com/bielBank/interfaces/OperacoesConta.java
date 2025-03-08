package br.com.bielBank.interfaces;

public interface OperacoesConta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}