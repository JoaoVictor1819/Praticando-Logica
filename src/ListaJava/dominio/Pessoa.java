package ListaJava.dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public String trabalho;
    private double salario;


    public Pessoa(String nome, int idade, String trabalho, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.trabalho = trabalho;
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", trabalho='" + trabalho + '\'' +
                ", salario=" + salario +
                '}';
    }
}
