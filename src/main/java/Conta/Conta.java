package Conta;

import Cliente.Cliente;


public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    @Override
    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("O VALOR DO SAQUE É MAIOR QUE O SEU SALDO! TENTE REALIZAR O SAQUE NOVAMENTE!");
        }else{
            this.saldo -= valor;
            System.out.println("SAQUE REALIZADO COM SUCESSO!");
        }

    }

    @Override
    public void depositar(double valor){
            this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor){
        if(this.saldo < valor){
            System.out.println("O VALOR DA TRANSFERÊNCIA É MAIOR QUE O SEU SALDO! TENTE REALIZAR A TRANSFERÊNCIA NOVAMENTE!");
        }else{
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString(){
        return "{" +
                "Titular='" + this.cliente.getNome() + '\'' +
                ", Agencia='" + this.agencia + '\'' +
                ", Conta=" + this.numeroConta +
                ", Saldo='" + this.saldo + '\'' +
                '}';
    }

    public void imprimirInformacoesConta(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
