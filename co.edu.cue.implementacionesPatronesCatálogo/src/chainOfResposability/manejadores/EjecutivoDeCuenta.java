package chainOfResposability.manejadores;

import chainOfResposability.IAprobador;

public class EjecutivoDeCuenta implements IAprobador {
    private IAprobador next;
    public IAprobador getNext(){
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if (monto<=10000){
            System.out.println("Lo manejo yo, el ejecutivo de cuenta");
        } else {
            next.solicitudPrestamo(monto);
        }
    }
    @Override
    public void setNext(IAprobador aprobador) {
        next=aprobador;
    }
}
