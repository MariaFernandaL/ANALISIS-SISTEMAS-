package main;

import model.TarjetaCredito;
import service.Pago;

public class Main4 {
    private static Pago pago;

        public static void main(String[] args) {
            definirPago();
        }

        public static void definirPago(){
            pago= new TarjetaCredito();

            if (pago.validar()) {
                pago.pagar();
            }
        }
}
