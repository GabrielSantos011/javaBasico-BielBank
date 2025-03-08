package br.com.bielBank;

import br.com.bielBank.domain.Conta;
import br.com.bielBank.domain.ContaCorrente;
import br.com.bielBank.domain.ContaPoupanca;
import br.com.bielBank.util.MenuUtil;

import java.util.Scanner;

public class BielBank {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opc = 0;
        Conta conta = null;
        double saldoInicial = 100;

        MenuUtil.boasVindas();
        MenuUtil.quebraLinha();
        do {
            MenuUtil.escolhaTipoConta();
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    conta = new ContaCorrente(saldoInicial);
                    System.out.println("Conta Corrente criada com saldo inicial de R$" + saldoInicial);
                    break;
                case 2:
                    conta = new ContaPoupanca(saldoInicial);
                    System.out.println("Conta Poupança criada com saldo inicial de R$" + saldoInicial);
                    break;
                default:
                    MenuUtil.opcInvalido();
            }
            MenuUtil.quebraLinha();
        } while (opc != 1 && opc != 2);

        opc= 0;

        do {
            if (conta instanceof ContaPoupanca) {
                MenuUtil.menuPrincipalContaPoupanca();
                opc = scan.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Seu saldo atual é: R$" + conta.getSaldo());
                        break;
                    case 2:
                        System.out.print("Digite o valor para depósito: R$");
                        double deposito = scan.nextDouble();
                        conta.depositar(deposito);
                        break;
                    case 3:
                        System.out.print("Digite o valor para saque: R$");
                        double saque = scan.nextDouble();
                        conta.sacar(saque);
                        break;
                    case 4:
                        ((ContaPoupanca) conta).renderJuros();
                        break;
                    case 9:
                        MenuUtil.despedida();
                        break;
                    default:
                        MenuUtil.opcInvalido();
                }
            } else {
                MenuUtil.menuPrincipalContaCorrente();
                opc = scan.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Seu saldo atual é: R$" + conta.getSaldo());
                        break;
                    case 2:
                        System.out.print("Digite o valor para depósito: R$");
                        double deposito = scan.nextDouble();
                        conta.depositar(deposito);
                        break;
                    case 3:
                        System.out.print("Digite o valor para saque: R$");
                        double saque = scan.nextDouble();
                        conta.sacar(saque);
                        break;
                    case 9:
                        System.out.println("Obrigado por usar o Banco Digital! Até mais.");
                        break;
                    default:
                        MenuUtil.despedida();
                }
            }
            MenuUtil.quebraLinha();
        } while (opc != 9);

        scan.close();
    }

}
