package chainOfResposability.manejadores;

import chainOfResposability.IAprobador;

public class Director implements IAprobador {
    private IAprobador next;


    public IAprobador getNext(){
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if (monto>=100000){
            System.out.println("Lo manejo yo, el director");
        } else {
            next.solicitudPrestamo(monto);
        }
    }
    @Override
    public void setNext(IAprobador aprobador) {

    }
}
