package factory;

import service.Particular;
import service.Send;

public class ParticularFactory extends FactoryShipping{
    @Override
    public Send crearFormaDeEnvio() {
        return new Particular();
    }
}
