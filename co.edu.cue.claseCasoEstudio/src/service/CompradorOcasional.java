package service;

import model.User;
import service.Mensaje;

public class CompradorOcasional extends User implements Mensaje {

    /**
     * Descripcion: Este metodo esta sobreescrito de la interface Mensaje, y define el mensaje a retornar cuando el usuario es un comprador ocasional
     * @return
     */
    @Override
    public String sendMessage() {
        return "Welcome, your registration was successful. Soon you will have access to the web catalog of technology products.";
    }

}

