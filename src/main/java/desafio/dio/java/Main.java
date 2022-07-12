package desafio.dio.java;

import Banco.Banco;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;
import Cliente.Cliente;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Nubank");

        Conta cc = new ContaCorrente(new Cliente("Igor", 12356789));
        Conta cp = new ContaPoupanca(new Cliente("José", 1235678));

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.imprimirContas();
    }
}