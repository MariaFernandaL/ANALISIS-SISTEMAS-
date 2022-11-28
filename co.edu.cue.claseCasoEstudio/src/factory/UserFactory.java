package factory;

import service.CompradorMayorista;
import service.CompradorOcasional;
import service.Mensaje;

public class UserFactory {


    /**
     * Descripción: con este metodo se ayuda a la creación y envio de mensaje de los diferentes tipos de compradores y sus mensajes respectivos
     * así, si se requiere agregar un nuevo comprador, sólo se tendrá que añadir en este método y no modificar el método principal de
     * creacion de usuarios. Factory Method.
     * @param mss
     * @return
     */
    public Mensaje menssageBuyer(String mss) {
        Mensaje mensaje=null;
        if (mss.equalsIgnoreCase("comprador mayorista")) {
            return mensaje = new CompradorMayorista();
        } else if (mss.equalsIgnoreCase("comprador ocasional")) {
            return mensaje = new CompradorOcasional();
        }
        return mensaje;
    }
}
