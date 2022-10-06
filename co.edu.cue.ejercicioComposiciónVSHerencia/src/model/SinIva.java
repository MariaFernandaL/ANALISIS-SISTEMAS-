package model;

import Interface.IvaStandard;

public class SinIva implements IvaStandard {

    @Override
    public double getImporteConIva(double importe) {
        return importe;
    }
}
