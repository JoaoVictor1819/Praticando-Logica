package ListaJava.main;

import ListaJava.dominio.Pessoa;

import java.util.ArrayList;

public class app {
    static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Victor", 19);
        Pessoa pessoa1 = new Pessoa("Luana", 21);


        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa1);

        for (int i = 0; i < 2; i++) {
            System.out.println(pessoas.get(i));
        }


    }
}
