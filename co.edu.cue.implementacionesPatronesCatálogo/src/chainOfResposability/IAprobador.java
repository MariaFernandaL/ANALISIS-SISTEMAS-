package chainOfResposability;

public interface IAprobador {
    void setNext(IAprobador aprobador);
    IAprobador getNext();
    void solicitudPrestamo(int monto);
}
