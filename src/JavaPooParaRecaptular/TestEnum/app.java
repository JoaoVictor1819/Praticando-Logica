package JavaPooParaRecaptular.TestEnum;

import JavaPooParaRecaptular.Enum.ComprasEnum;
import JavaPooParaRecaptular.Enum.DayOfTheWeek;
import JavaPooParaRecaptular.Enum.PeriodoEnum;
import JavaPooParaRecaptular.Enum.Salgadinhos;

import java.awt.image.DataBufferUShort;

public class app {
    static void main(String[] args) {
        ComprasEnum codigo = ComprasEnum.COMPRA;
        System.out.println(codigo.getCode());


        Salgadinhos salgado = Salgadinhos.COXINHA;
        System.out.println(salgado.getLevelofDeliciusness());
        System.out.println(salgado.getPrice());
    }
}
