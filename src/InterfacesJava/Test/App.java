package InterfacesJava.Test;

import InterfacesJava.Dominio.Funcionario;

public class App {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Dev", "Joao", 123121321);
        funcionario.toString();
    }
}
