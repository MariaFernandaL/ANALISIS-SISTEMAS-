package service;

import model.User;
import service.Mensaje;

public class CompradorMayorista extends User implements Mensaje{

    /**
     * Descripcion: Este metodo esta sobreescrito de la interface Mensaje y define el mensaje a retornar cuando el usuario es un comprador mayorista
     * @return
     */
    @Override
    public String sendMessage() {
        return "The mail was sent successfully";
    }

}
