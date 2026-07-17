package JavaPooParaRecaptular.Enum;

public enum PeriodoEnum {
    MANHA("Manha"),
    TARDE("Tarde"),
    NOITE("Noite");

    private String horario;

    PeriodoEnum(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }
}
