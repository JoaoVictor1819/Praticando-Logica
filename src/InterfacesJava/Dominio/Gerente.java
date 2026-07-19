package InterfacesJava.Dominio;

public abstract class Gerente implements Promocao {
        private String Funcao;

    public Gerente(String Funcao) {
        this.Funcao = Funcao;
    }

    public String getFuncao() {
        return Funcao;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "Funcao='" + Funcao + '\'' +
                '}';
    }
}
