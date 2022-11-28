package model;

public class ReferenciaPredeterminada {

    public void computadorBasico(ComputadorBuilder computadorBuilder){
        computadorBuilder.setColor("blue")
                .setMonitor("monitor")
                .setProcesador("RYZEN 5")
                .setRam("8")
                .setTarjetaGrafica("tg");
    }

    public void computadorProgramador(ComputadorBuilder computadorBuilder){
        computadorBuilder.setColor("blue")
                .setMonitor("monitor")
                .setProcesador("RYZEN 5")
                .setRam("8")
                .setTarjetaGrafica("tg");
    }
}
