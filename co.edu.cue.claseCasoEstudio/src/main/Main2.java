package main;

import factory.FactoryShipping;
import factory.TransportadoraFactory;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        //String opcion = JOptionPane.showInputDialog("ELIJA LA FORMA DE ENVIO");

        FactoryShipping factoryShipping= new TransportadoraFactory();
        factoryShipping.realizarEnvio();


    }


}
