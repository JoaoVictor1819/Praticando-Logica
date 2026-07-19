package InterfacesJava.Dominio;

public class Funcionario extends Gerente{
    private String nome;
    private int cpf;


    public Funcionario(String Funcao, String nome, int cpf) {
        super(Funcao);
        this.nome = nome;
        this.cpf = cpf;
    }


    @Override
    public void promocao() {
        System.out.println("Promovido!");
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
