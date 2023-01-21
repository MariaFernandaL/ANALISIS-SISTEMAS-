package singleton;

public class Main {
    public static void main(String[] args) {
        SoyUnico ricardo= SoyUnico.getSingletonInstance("Ricardo Perez");
        SoyUnico ramon= SoyUnico.getSingletonInstance("Ramon Lopez");

        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());
    }
}
