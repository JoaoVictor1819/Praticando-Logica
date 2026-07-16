package LogicaDeProgramação;

public class CastingConversaoDeTipo {
    static void main(String[] args) {
        int nume = 3000;
        double d = nume;
        System.out.println(d);


        double d2 = 10.2;
        int i2 = (int) d2;
        System.out.println(i2);

        String numeroString2 = "12";
        Integer numeroConvertido = Integer.parseInt(numeroString2);
        System.out.println(numeroConvertido);


        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();
        System.out.println(numeroString);


    }

}
