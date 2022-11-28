package model;

public class Computador {

    private String ram;
    private String color;
    private String monitor;
    private String procesador;
    private String tarjetaGrafica;

    public Computador() {
    }

    public Computador(String ram, String color, String monitor, String procesador, String tarjetaGrafica) {
        this.ram = ram;
        this.color = color;
        this.monitor = monitor;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "ram='" + ram + '\'' +
                ", color='" + color + '\'' +
                ", monitor='" + monitor + '\'' +
                ", procesador='" + procesador + '\'' +
                ", tarjetaGrafica='" + tarjetaGrafica + '\'' +
                '}';
    }
}
