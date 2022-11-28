package command.acciones;

import command.Command;
import command.receiver.Puerta;

public class CerrarPuerta implements Command {

    private Puerta puerta;

    public CerrarPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    @Override
    public void execute() {
        puerta.conectar();
        puerta.cerrar();
        puerta.desconectar();
    }
}
