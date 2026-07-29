package ListaJava.main;

import ListaJava.dominio.Pessoa;

import java.util.ArrayList;

public class app {
    static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Victor", 19, "Estagiario de engenharia de software", "1313213-21");
        Pessoa pessoa1 = new Pessoa("Luana", 21, "Diretora de Escola", "7567577567-75");
        Pessoa pessoa2 = new Pessoa("Carlos", 31, "Arquiteto","");
        Pessoa pessoa3 = new Pessoa("Jese", 71, "Medico","456473534-65");
        Pessoa pessoa4 = new Pessoa("Adriana", 53, "Advogada","324234255-75");
        Pessoa pessoa5 = new Pessoa("Lucas", 23, "Estagiario de direito","43144353-54");


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
