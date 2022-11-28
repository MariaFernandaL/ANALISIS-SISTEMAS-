package factory;

import service.Particular;
import service.Send;
import service.Transportadora;

public abstract class FactoryShipping {

    public abstract Send crearFormaDeEnvio();

    public void realizarEnvio(){
        Send envio= crearFormaDeEnvio();
        envio.Send();
    }
}
