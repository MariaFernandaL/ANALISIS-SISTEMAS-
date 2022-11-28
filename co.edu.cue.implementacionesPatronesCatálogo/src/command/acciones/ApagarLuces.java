package command.acciones;

import command.Command;
import command.receiver.Luces;

public class ApagarLuces implements Command {
    private Luces luces;

    public ApagarLuces(Luces luces) {
        this.luces = luces;
    }

    @Override
    public void execute() {
        luces.conectar();
        luces.apagar();
        luces.desconectar();
    }
}
