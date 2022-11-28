package builder;

public class Main {
    public static void main(String[] args) {
        RelojBuilder relojBuilder= new RelojBuilder();
        relojBuilder.setBateria("SI")
                .setCorona("NO")
                .setCorrea("SI")
                .setIndicadores("NO")
                .setManecillas("NO")
                .setPantalla("SI")
                .setSensor("SI");

        Reloj reloj= relojBuilder.build();
        System.out.println(reloj.toString());
    }
}
