package ExecoesJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class app {
    static void main(String[] args) {
        divisao();
    }


    public static void divisao() {
        Scanner sc = new Scanner(System.in);

        boolean opcao = false;
        while (opcao == false) {

            System.out.println("Digite o Primeiro numero: ");
            int num1 = sc.nextInt();
            System.out.println("Digite o Segundo numero: ");
            int num2 = sc.nextInt();

            try {
                int div = num1 / num2;
                System.out.println("Resultado da divisao " + div);
                opcao = true;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Erro ocorrido: "+ e.getMessage());
            }
        }


    }
}
