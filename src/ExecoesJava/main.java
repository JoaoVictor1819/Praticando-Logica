package ExecoesJava;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        //array
        Integer[] arrayInteiros = new Integer[10];
        arrayInteiros[0] = 2;
        arrayInteiros[1] = 4;
        arrayInteiros[2] = 11;
        arrayInteiros[3] = 7;
        arrayInteiros[4] = 9;
        arrayInteiros[5] = null;
        arrayInteiros[6] = 3;
        arrayInteiros[7] = null;
        arrayInteiros[8] = 1;
        arrayInteiros[9] = null;

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(arrayInteiros[i]);

            } catch (ArrayIndexOutOfBoundsException a) {
                a.printStackTrace();
                System.out.println("Erro no Array " + a.getMessage());
            }
        }
    }
}
