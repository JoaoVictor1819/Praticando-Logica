package InterfacesJava;

public class Cachorro implements Animal {
    private String raca;

    public Cachorro(String raca) {
        this.raca = raca;
    }

    @Override
    public void beber() {
        System.out.println("Cachorro da raca " +raca+" bebel!");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro da raca "+raca+" comeu!");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                '}';
    }
}
