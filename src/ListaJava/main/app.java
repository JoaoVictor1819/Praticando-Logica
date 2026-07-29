package ListaJava.main;

import ListaJava.dominio.Pessoa;

import java.util.ArrayList;

public class app {
    static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Victor", 19, "Estagiario de engenharia de software", 12323);
        Pessoa pessoa1 = new Pessoa("Luana", 21, "Diretora de Escola",31231);
        Pessoa pessoa2 = new Pessoa("Carlos", 31, "Arquiteto",3123123);
        Pessoa pessoa3 = new Pessoa("Jese", 71, "Medico",31231);
        Pessoa pessoa4 = new Pessoa("Adriana", 53, "Advogada",534534);
        Pessoa pessoa5 = new Pessoa("Lucas", 23, "Estagiario de direito",534535);


        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);

        for (int i = 0; i < 6; i++) {
            System.out.println(pessoas.get(i));
        }


    }
}
