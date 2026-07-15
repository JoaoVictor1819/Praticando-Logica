package LogicaDeProgramação;

import java.util.Locale;

public class Variaveis {
    static void main(String[] args) {
        int idade = 23;
        double salario = 4500;
        String sexo = "M";
        boolean EstaImpregado = true;

        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("sexo: " + sexo);
        System.out.println("Ele esta empregado? " + EstaImpregado);


        String nome = "Ana";
        String produto = "Pão";
        double preco = 0.50;
        int quantidade = 8;


        System.out.println(nome+" Comprou "+produto+" que foi: "+preco);
        double quantidadeTotal = preco * quantidade;
        System.out.println(produto+" foram: "+quantidadeTotal);


        double pao = 9.50;
        double queijo = 4.50;
        double coxinha = 4.00;
        double Desconto = 4.40;
        int diasDoMes = 30;


        double total = pao + queijo + coxinha;
        double valorComDesconto = total - Desconto;
        double gastoTotalDoMes = valorComDesconto * diasDoMes;
        System.out.println("Valor total = R$" + total);
        System.out.println("Valor total com desconto = R$" + valorComDesconto);
        System.out.println("Valor total gastor no mes = R$" + gastoTotalDoMes);
    }
}
