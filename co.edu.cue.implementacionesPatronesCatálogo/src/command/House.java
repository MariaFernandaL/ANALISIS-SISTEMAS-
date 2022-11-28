package command;

import command.acciones.AbrirPuerta;
import command.acciones.EncenderLuces;
import command.receiver.Luces;
import command.receiver.Puerta;

public class House {
    public static void main(String[] args) {
        Command command= new EncenderLuces(new Luces());
        Invoker invoker= new Invoker(command);
        invoker.run();
        System.out.println("-------------------------------------------");
        command= new AbrirPuerta(new Puerta());
        invoker= new Invoker(command);
        invoker.run();

    }
}
