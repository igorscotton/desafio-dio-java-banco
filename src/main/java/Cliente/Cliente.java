package Cliente;

public class Cliente {

    private String nome;
    private int cpf;

    public Cliente(){

    }

    public Cliente(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
}
