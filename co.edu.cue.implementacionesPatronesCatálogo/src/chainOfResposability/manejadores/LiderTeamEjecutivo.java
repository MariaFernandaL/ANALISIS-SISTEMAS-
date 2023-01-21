package chainOfResposability.manejadores;

import chainOfResposability.IAprobador;

public class LiderTeamEjecutivo implements IAprobador {
    private IAprobador next;

    public IAprobador getNext(){
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if (monto>10000 && monto<=5000){
            System.out.println("Lo manejo yo, el lider");
        } else {
            next.solicitudPrestamo(monto);
        }
    }

    @Override
    public void setNext(IAprobador aprobador) {
        next=aprobador;
    }
}
