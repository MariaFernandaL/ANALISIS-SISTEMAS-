package model;

import service.Pago;

public class PayPal implements Pago {

    private String correo;
    private String password;

    @Override
    public Boolean validar() {
        System.out.println("Validando los datos paypal");
        return true;
    }

    @Override
    public void pagar() {
        System.out.println("Pagar con paypal");
    }
}
