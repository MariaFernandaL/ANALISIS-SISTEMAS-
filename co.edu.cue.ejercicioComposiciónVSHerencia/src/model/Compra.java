package model;

import Interface.IvaStandard;

public class Compra {
    private String id;
    private String concepto;
    private double importe;
    private IvaStandard tipo;


    public Compra(String id, String concepto, double importe, IvaStandard tipo) {
        super();
        this.id = id;
        this.concepto = concepto;
        this.importe = importe;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getImporteConIva(){
        return tipo.getImporteConIva(this.getImporte());
    }
}
