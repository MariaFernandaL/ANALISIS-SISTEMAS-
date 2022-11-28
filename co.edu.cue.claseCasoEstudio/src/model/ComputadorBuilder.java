package model;

import service.Builder;

public class ComputadorBuilder implements Builder {
    private String ram;
    private String color;
    private String monitor;
    private String procesador;
    private String tarjetaGrafica;

    public ComputadorBuilder setRam(String ram){
        this.ram= ram;
        return this;
    }
    public ComputadorBuilder setColor(String color){
        this.color= color;
        return this;
    }
    public ComputadorBuilder setMonitor(String monitor){
        this.monitor= monitor;
        return this;
    }
    public ComputadorBuilder setProcesador(String procesador){
        this.procesador= procesador;
        return this;
    }
    public ComputadorBuilder setTarjetaGrafica(String tarjetaGrafica){
        this.tarjetaGrafica= tarjetaGrafica;
        return this;
    }

    public Computador build(){
        return new Computador(ram, color, monitor, procesador, tarjetaGrafica);
    }


}
