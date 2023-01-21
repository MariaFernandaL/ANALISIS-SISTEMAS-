package chainOfResposability.manejadores;

import chainOfResposability.IAprobador;

public class Gerente implements IAprobador {
    private IAprobador next;

    public IAprobador getNext(){
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if (monto>5000 && monto<=100000){
            System.out.println("Lo manejo yo, el gerente");
        } else {
            next.solicitudPrestamo(monto);
        }
    }

    @Override
    public void setNext(IAprobador aprobador) {
        next=aprobador;
    }
}
