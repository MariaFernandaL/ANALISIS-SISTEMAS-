package mediator;

public class Main {
    public static void main(String[] args) {
        SalonDeChat s = new SalonDeChat();

        Usuario u = new Usuario(s);
        u.setNombre("Juan");
        s.registra(u);

        Usuario u1 = new Usuario(s);
        u1.setNombre("Pepe");
        s.registra(u1);

        Usuario u2 = new Usuario(s);
        u2.setNombre("Pedro");
        s.registra(u2);

        u.envia("Pepe", "Hola como andas");
        u1.envia("Juan", "Todo ok, vos?");
        u2.envia("Pedro", "Martin estas?");
    }
}
