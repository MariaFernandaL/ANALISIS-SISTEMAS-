package model;

import service.Mensaje;

public class CompradorOcasional extends User implements Mensaje {

    @Override
    public String sendMessage() {
        return "Welcome, your registration was successful. Soon you will have access to the web catalog of technology products.";
    }

}

