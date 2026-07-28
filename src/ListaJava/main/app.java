package ListaJava.main;

import ListaJava.dominio.Pessoa;

import java.util.ArrayList;

public class app {
    static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Victor", 19, "Engenhero de Software");
        Pessoa pessoa1 = new Pessoa("Luana", 21, "Diretora de Escola");
        Pessoa pessoa2 = new Pessoa("Carlos", 31, "Arquiteto");
        Pessoa pessoa3 = new Pessoa("Jese", 71, "Medico");
        Pessoa pessoa4 = new Pessoa("Adriana", 53, "Advogada");


        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        for (int i = 0; i < 5; i++) {
            System.out.println(pessoas.get(i));
        }


    }
}
