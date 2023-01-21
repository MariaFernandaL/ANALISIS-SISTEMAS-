package chainOfResposability;

import chainOfResposability.manejadores.Director;
import chainOfResposability.manejadores.EjecutivoDeCuenta;
import chainOfResposability.manejadores.Gerente;
import chainOfResposability.manejadores.LiderTeamEjecutivo;

public class Banco implements IAprobador{
    private IAprobador next;

    public IAprobador getNext(){
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        EjecutivoDeCuenta ejecutivo= new EjecutivoDeCuenta();
        this.setNext(ejecutivo);

        LiderTeamEjecutivo lider= new LiderTeamEjecutivo();
        ejecutivo.setNext(lider);

        Gerente gerente= new Gerente();
        lider.setNext(gerente);

        Director director= new Director();
        gerente.setNext(director);

        next.solicitudPrestamo(monto);
    }

    @Override
    public void setNext(IAprobador aprobador) {
        next=aprobador;
    }
}
