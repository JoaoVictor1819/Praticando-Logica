package LogicaDeProgramação;

import java.util.Scanner;

public class EntradaSaidaDeDados {
    static void main(String[] args) {
//        System.out.println("Olá faço impressão e pulo a linha");
//        System.out.print("Olá eu faço a impressão na mesma linha");
//        System.out.printf("Olá faço a impressão formatada");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);
        System.out.println("Agora digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("A idade de "+nome+ " é: "+idade);
        System.out.println("Você esta empregada "+nome+" ? (True) or (False): ");
        boolean estaEmpregado = scanner.nextBoolean();
        if (estaEmpregado == true){
            System.out.println(nome+" esta empregado");
        }
        System.out.println(nome+ " inda não esta empregado");
    }
}
