package command;

public class Invoker {
    private Command orden;

    public Invoker(Command orden) {
        this.orden = orden;
    }

    public void run(){
        orden.execute();
    }
}
