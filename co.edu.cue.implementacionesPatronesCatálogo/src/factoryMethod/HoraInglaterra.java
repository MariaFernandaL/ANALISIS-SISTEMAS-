package factoryMethod;

import java.util.Calendar;
import java.util.Date;

public class HoraInglaterra implements Hora {

    @Override
    public void calcularHora() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, 5);
        System.out.println("Fecha y hora Londres: "+calendar.getTime());
    }
}
