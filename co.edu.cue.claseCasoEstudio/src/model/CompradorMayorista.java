package model;

import service.Mensaje;

public class CompradorMayorista extends User implements Mensaje{

    @Override
    public String sendMessage() {
        return "The mail was sent successfully";
    }

}
