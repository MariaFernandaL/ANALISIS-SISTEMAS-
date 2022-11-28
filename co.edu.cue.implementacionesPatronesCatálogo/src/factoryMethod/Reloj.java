package factoryMethod;

import javax.swing.*;

public class Reloj {
    public static void main(String[] args) {
        String pais= JOptionPane.showInputDialog("Ingrese el pais para mostrar la hora actual");

        FactoryMethod factory= new FactoryHoraPais();
        Hora hora= factory.createRelojPais(pais);
        hora.calcularHora();

    }
}
