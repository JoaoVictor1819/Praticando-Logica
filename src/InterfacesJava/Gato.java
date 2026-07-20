package InterfacesJava;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Gato implements Animal{
    private String raca;

    public Gato(String raca) {
        this.raca = raca;
    }

    @Override
    public void beber() {
        System.out.println("O gato da raca "+raca+" bebel!");
    }

    @Override
    public void comer() {
        System.out.println("O gato da raca "+ raca+ " comeu!");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raca='" + raca + '\'' +
                '}';
    }
}
