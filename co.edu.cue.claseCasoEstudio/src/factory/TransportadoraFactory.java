package factory;

import service.Send;
import service.Transportadora;

public class TransportadoraFactory extends FactoryShipping{
    @Override
    public Send crearFormaDeEnvio() {
        return new Transportadora();
    }
}
