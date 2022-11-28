package command.acciones;

import command.Command;
import command.receiver.Puerta;

import javax.sound.sampled.Port;

public class AbrirPuerta implements Command {

    private Puerta puerta;

    public AbrirPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    @Override
    public void execute() {
        puerta.conectar();
        puerta.abrir();
        puerta.desconectar();
    }
}
