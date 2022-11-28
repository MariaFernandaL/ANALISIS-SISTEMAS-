package factoryMethod;

import java.util.Date;

public class HoraColombia implements Hora {

    @Override
    public void calcularHora() {
        Date date = new Date();
        System.out.println("Fecha y hora Colombia: " + date);
    }
}
