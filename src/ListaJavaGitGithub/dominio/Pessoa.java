package ListaJavaGitGithub.dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public String trabalho;


    public Pessoa(String nome, int idade, String trabalho) {
        this.nome = nome;
        this.idade = idade;
        this.trabalho = trabalho;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", trabalho='" + trabalho + '\'' +
                '}';
    }
}
