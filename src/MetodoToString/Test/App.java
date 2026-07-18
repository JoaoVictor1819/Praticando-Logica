package MetodoToString.Test;

import MetodoToString.Dominio.Pessoa;

public class App {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "12233455-32");
        System.out.println(pessoa);
        pessoa.toString();

    }
}
