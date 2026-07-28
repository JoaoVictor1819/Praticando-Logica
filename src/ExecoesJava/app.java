package ExecoesJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class app {
    static void main(String[] args) {
        divisao();
        info();
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

    private static void info(){
        String[] nome = new String[3];

         nome[0] = "Joao";
         nome[1] = "Carlos";
         nome[2] = "Julio";

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(nome[i]);
            }catch (ArrayIndexOutOfBoundsException a){
                a.printStackTrace();
            }
        }

    }

}
