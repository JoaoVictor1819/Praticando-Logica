package InterfacesJava;

public class Main {
    static void main(String[] args) {
       Cachorro cachorro = new Cachorro("puddle");
        System.out.println(cachorro.toString());
       cachorro.comer();
       cachorro.beber();
        System.out.println("==============");
        Gato gato = new Gato("Gato preto");
        System.out.println(gato.toString());
        gato.beber();
        gato.comer();


    }
}
