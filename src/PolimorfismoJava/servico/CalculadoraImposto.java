package PolimorfismoJava.servico;

import PolimorfismoJava.dominio.Computador;
import PolimorfismoJava.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        double impostoComputador = computador.calcularImposto();
        System.out.println("Relatorio de imposto do computador");
        System.out.println("Computador "+computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("Imposto a ser pago "+ impostoComputador);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        double impostoTomate = tomate.calcularImposto();
        System.out.println("Relatorio de imposto do Tomate");
        System.out.println("Tomate "+tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println("Imposto a ser pago "+impostoTomate);
    }
}
