package LogicaDeProgramação;

public class OperadoresAritimeticos {
    static void main(String[] args) {

        int not1 = 40;
        int not2 = 60;

        int soma = (not1 + not2) / 2;

        if (soma >= 50){
            System.out.println("Aprovado: "+soma);
        } else {
            System.out.println("VAZA: "+soma);
        }
    }
}
