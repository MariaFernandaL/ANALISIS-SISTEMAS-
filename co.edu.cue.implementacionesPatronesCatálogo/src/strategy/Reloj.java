package strategy;

import javax.swing.*;

public class Reloj {
    public static void main(String[] args) {
        Hora horaActualPais= null;
        String pais= JOptionPane.showInputDialog("Ingrese el pais para mostrar la hora actual");

        if (pais.equalsIgnoreCase("corea")){
            horaActualPais= new HoraCorea();
        } else if (pais.equalsIgnoreCase("colombia")){
            horaActualPais= new HoraColombia();
        }else if (pais.equalsIgnoreCase("inglaterra")){
            horaActualPais= new HoraInglaterra();
        } else if (pais.equalsIgnoreCase("")){
            System.out.println("EL PAIS INGRESADO NO ESTA DISPONIBLE");
        }
        horaActualPais.calcularHora();

    }
}
