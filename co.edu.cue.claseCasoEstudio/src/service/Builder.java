package service;

import model.Computador;
import model.ComputadorBuilder;

public interface Builder {
     ComputadorBuilder setRam(String ram);
     ComputadorBuilder setColor(String color);
     ComputadorBuilder setMonitor(String monitor);
     ComputadorBuilder setProcesador(String procesador);
     ComputadorBuilder setTarjetaGrafica(String tarjetaGrafica);
     Computador build();
}
