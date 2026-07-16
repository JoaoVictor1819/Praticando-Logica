package LogicaDeProgramação;

public class EstruturaCondicional {
    static void main(String[] args) {
        boolean acordado = true;
        int idade = 18;

        if (acordado == true){
            System.out.println("Esta acordado");
        }else {
            System.out.println("Dormindo");
        }

        if (idade < 18){
            System.out.println("Adolecente!");
        } else {
            System.out.println("Maior de idade!");
        }

        boolean TemRoupaBoa = true;
        boolean CelularCarregado = true;

        if (TemRoupaBoa && CelularCarregado){
            System.out.println("Pode sair para o parque");
        } else if (TemRoupaBoa || CelularCarregado) {
            System.out.println("Vai so comer um pasteu na esquina mesmo");
        } else {
            System.out.println("Vai dormir que amanha é outro dia!");
        }

        String mensagem = (TemRoupaBoa) ? "Vai para o cinema" : "Fica em casa";
        System.out.println(mensagem);



    }
}
