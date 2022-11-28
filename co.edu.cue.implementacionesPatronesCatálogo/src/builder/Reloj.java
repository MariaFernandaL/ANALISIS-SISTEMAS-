package builder;

public class Reloj {
    private String manecillas;
    private String indicadores;
    private String corona;
    private String correa;
    private String caratula;
    private String pantalla;
    private String bateria;
    private String sensor;

    public Reloj() {
    }

    public Reloj(String manecillas, String indicadores, String corona, String correa, String caratula, String pantalla, String bateria, String sensor) {
        this.manecillas = manecillas;
        this.indicadores = indicadores;
        this.corona = corona;
        this.correa = correa;
        this.caratula = caratula;
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.sensor = sensor;
    }

    public String getManecillas() {
        return manecillas;
    }

    public void setManecillas(String manecillas) {
        this.manecillas = manecillas;
    }

    public String getIndicadores() {
        return indicadores;
    }

    public void setIndicadores(String indicadores) {
        this.indicadores = indicadores;
    }

    public String getCorona() {
        return corona;
    }

    public void setCorona(String corona) {
        this.corona = corona;
    }

    public String getCorrea() {
        return correa;
    }

    public void setCorrea(String correa) {
        this.correa = correa;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "manecillas='" + manecillas + '\'' +
                ", indicadores='" + indicadores + '\'' +
                ", corona='" + corona + '\'' +
                ", correa='" + correa + '\'' +
                ", caratula='" + caratula + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", bateria='" + bateria + '\'' +
                ", sensor='" + sensor + '\'' +
                '}';
    }
}
