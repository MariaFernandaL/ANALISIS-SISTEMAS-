package builder;

public class RelojBuilder implements Builder{

    private String manecillas;
    private String indicadores;
    private String corona;
    private String correa;
    private String caratula;
    private String pantalla;
    private String bateria;
    private String sensor;


    public RelojBuilder setManecillas(String manecillas){
        this.manecillas= manecillas;
        return this;
    }
    public RelojBuilder setIndicadores(String indicadores){
        this.indicadores= indicadores;
        return this;
    }
    public RelojBuilder setCorona(String corona){
        this.corona= corona;
        return this;
    }
    public RelojBuilder setCorrea(String correa){
        this.correa= correa;
        return this;
    }
    public RelojBuilder setCaratula(String caratula){
        this.caratula= caratula;
        return this;
    }
    public RelojBuilder setPantalla(String pantalla){
        this.pantalla= pantalla;
        return this;
    }
    public RelojBuilder setBateria(String bateria){
        this.bateria= bateria;
        return this;
    }
    public RelojBuilder setSensor(String sensor){
        this.sensor= sensor;
        return this;
    }

    public Reloj build(){
        return new Reloj(manecillas, indicadores, corona, correa, caratula, pantalla, bateria, sensor);
    }

}
