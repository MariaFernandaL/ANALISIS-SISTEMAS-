package model;

import service.Pago;

public class TarjetaCredito implements Pago {

    private String numeroTarjeta;
    private String csv;

    @Override
    public Boolean validar() {
        System.out.println("Validando los datos tarjeta de credito");
        return true;
    }

    @Override
    public void pagar() {
        System.out.println("Pagar con tarjeta de credito");
    }
}
