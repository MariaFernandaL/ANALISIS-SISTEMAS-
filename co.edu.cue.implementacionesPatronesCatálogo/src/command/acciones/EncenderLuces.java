package command.acciones;

import command.Command;
import command.receiver.Luces;

public class EncenderLuces implements Command {

    private Luces luces;

    public EncenderLuces(Luces luces) {
        this.luces = luces;
    }

    @Override
    public void execute() {
        luces.conectar();
        luces.encender();
        luces.desconectar();
    }


}
