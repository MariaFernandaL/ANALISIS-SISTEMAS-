package main;

import model.Computador;
import model.ComputadorBuilder;
import model.ReferenciaPredeterminada;

public class Main3 {

    public static void main(String[] args) {
        ReferenciaPredeterminada crearReferencia= new ReferenciaPredeterminada();
        ComputadorBuilder computadorBuilder= new ComputadorBuilder();
        crearReferencia.computadorBasico(computadorBuilder);
        crearReferencia.computadorProgramador(computadorBuilder);
    }
}
