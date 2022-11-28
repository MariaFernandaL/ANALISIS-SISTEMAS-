package builder;

public interface Builder {
    RelojBuilder setManecillas(String manecillas);
    RelojBuilder setIndicadores(String indicadores);
    RelojBuilder setCorona(String corona);
    RelojBuilder setCorrea(String correa);
    RelojBuilder setCaratula(String caratula);
    RelojBuilder setPantalla(String pantalla);
    RelojBuilder setBateria(String bateria);
    RelojBuilder setSensor(String sensor);

    Reloj build();
}
