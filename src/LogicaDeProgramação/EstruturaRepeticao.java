package LogicaDeProgramação;

public class EstruturaRepeticao {
    static void main(String[] args) {

        int valor = 0;
//
//        while (valor <= 5){
//            System.out.println("valor "+ valor);
//            valor++;
//        }

        do {
            System.out.println("Contador do While "+ valor);
            valor++;
        } while (valor < 5);



        for (int i = 0; i <= 10; i++){
            System.out.println("Contador ="+ i);
        }
    }
}
