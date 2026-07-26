package PolimorfismoJava.test;

import PolimorfismoJava.dominio.Computador;
import PolimorfismoJava.dominio.Produto;
import PolimorfismoJava.dominio.Tomate;
import PolimorfismoJava.servico.CalculadoraImposto;

public class Main {
    static void main(String[] args) {
        Produto tomate = new Tomate("Tomate verde", 10);
        Produto computador = new Computador("ASUS", 2600);
        CalculadoraImposto.calcularImpostoComputador((Computador) computador);
        System.out.println("=======================");
        CalculadoraImposto.calcularImpostoTomate((Tomate) tomate);
    }
}
