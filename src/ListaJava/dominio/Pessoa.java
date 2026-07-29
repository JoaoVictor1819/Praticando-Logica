package ListaJava.dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public String trabalho;
    public String cpf;

    public Pessoa(String nome, int idade, String trabalho, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.trabalho = trabalho;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", trabalho='" + trabalho + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
