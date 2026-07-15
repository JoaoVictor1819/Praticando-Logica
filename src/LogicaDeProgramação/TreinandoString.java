package LogicaDeProgramação;

public class TreinandoString {
    static void main(String[] args) {
        String nome = "Bernado";
        String nome2 = " Matheus";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nome2);
        String nomeCompleto = nome.concat(nome2);

        System.out.println("Olá "+ nome.toUpperCase() + " Seu nome tem "+ tamanhoString+ " caracteres");
        System.out.println("Os nome são iguais? "+saoIguais);
        System.out.println("Seu nome todo é: "+ nomeCompleto);
    }
}
