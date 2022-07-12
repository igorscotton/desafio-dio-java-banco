package Banco;

import Conta.Conta;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();

    public Banco(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta novaConta){
        this.contas.add(novaConta);
    }

    public void imprimirContas(){

        for(int i = 0; i < contas.size(); i++){
            Conta conta = this.contas.get(i);
            if(i == 0){
                System.out.println("=== lISTA DE CONTAS ===");
            }

            System.out.println("Titular: " + conta.getCliente().getNome());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Conta: " + conta.getNumeroConta());
            System.out.println("Saldo: " + conta.getSaldo());

            System.out.println("====================");
        }
        System.out.println(this.contas);
    }
}
