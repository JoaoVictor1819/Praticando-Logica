package JavaPooParaRecaptular.Enum;

public enum Salgadinhos {
    COXINHA(10, 2.30),
    ENROLADO(7, 5.0),
    MINIPIZZA(5, 3.0);

    final int levelofDeliciusness;
    final double price;

    Salgadinhos(int levelofDeliciusness, double price) {
        this.levelofDeliciusness = levelofDeliciusness;
        this.price = price;
    }

    public int getLevelofDeliciusness() {
        return levelofDeliciusness;
    }

    public double getPrice() {
        return price;
    }
}
