package br.com.bielBank.util;

public class MenuUtil {

    public static void boasVindas() {
        System.out.println("Seja bem vindo ao BielBank!");
    }

    public static void escolhaTipoConta() {
        System.out.print("""
                Escolha o tipo de conta:
                
                1 -  Conta Corrente
                2 -  Conta Poupança
                
                Opção:\u00A0""");
    }

    public static void menuPrincipalContaPoupanca() {
        System.out.print("""
                1 -  Consultar Saldo
                2 -  Depositar
                3 -  Sacar
                4 -  Render Juros
                9 -  Sair
                
                Opção:\u00A0""");
    }

    public static void menuPrincipalContaCorrente() {
        System.out.print("""
                1 -  Consultar Saldo
                2 -  Depositar
                3 -  Sacar
                9 -  Sair
                
                Opção:\u00A0""");
    }

    public static void opcInvalido() {
        System.out.println("Opção inválida! Tente novamente.");
    }

    public static void despedida() {
        System.out.println("Obrigado por usar o Biel Bank! Até mais.");
    }

    public static void quebraLinha() {
        System.out.println();
    }

}
