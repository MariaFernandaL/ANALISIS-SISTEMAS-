package main;

import model.Compra;
import model.Iva;
import model.IvaReducido;
import model.SinIva;

public class Main {
    public static void main(String[] args) {
        Compra c= new Compra("1A", "ordenador", 200, new Iva());
        System.out.println(c.getImporteConIva());
        Compra c1= new Compra("1A", "ordenador", 200, new IvaReducido());
        System.out.println(c1.getImporteConIva());
        Compra c2= new Compra("1A", "ordenador", 200, new SinIva());
        System.out.println(c2.getImporteConIva());
        Compra c3= new Compra("2A", "teclado", 600, new Iva());
        System.out.println(c3.getImporteConIva());
    }
}
