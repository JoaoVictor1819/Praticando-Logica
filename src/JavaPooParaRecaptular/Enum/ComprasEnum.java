package JavaPooParaRecaptular.Enum;

public enum ComprasEnum {
    COMPRA(1),
    VENDA(2),
    ESTOQUE(3);

    private Integer code;

    ComprasEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
