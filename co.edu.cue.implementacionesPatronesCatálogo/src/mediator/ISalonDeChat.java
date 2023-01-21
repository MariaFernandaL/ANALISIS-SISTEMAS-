package mediator;

public interface ISalonDeChat {
    abstract void registra(Usuario participante);
    abstract void envia(String de,
                        String a, String msg);

}
